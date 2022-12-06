package com.search.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.data.model.DataModel;
import com.search.data.repository.IDataModelRepository;
@Service
public class DataServiceImpl implements IDataService{
	
	@Autowired
	private IDataModelRepository iDataModelRepository;

	@Override
	public String addUserData(DataModel data) {
		
		iDataModelRepository.save(data);
		
		return "Data added successfully";
	}

	@Override
	public DataModel findByPancard(String pancard) {
		System.out.println(pancard + " pancard value inside DataServiceImpl");
		return iDataModelRepository.findByPanCard(pancard);
	}

	@Override
	public DataModel findByPancardAndAadharCard(String pancard, String AadharCard) {
		
		DataModel dataModel = iDataModelRepository.findByPanCardAndAadharCard(pancard, AadharCard);
		
		return dataModel;
	}


	
	
	

}
