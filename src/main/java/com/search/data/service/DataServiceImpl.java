package com.search.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.data.model.DataModel;
import com.search.data.repository.IDataModelRepository;

@Service
public class DataServiceImpl implements IDataService {

	@Autowired
	private IDataModelRepository iDataModelRepository;

	@Override
	public String addUserData(DataModel data) {

		iDataModelRepository.save(data);

		return "Data added successfully";
	}

	
	/**
	 * This method has implementation of 'findByPanCard' method available inside 'IDataService'
	 */
	@Override
	public DataModel findByPancard(String pancard) {

		return iDataModelRepository.findByPanCard(pancard);
	}

	
	/**
	 * This method has implementation of 'findByPancardAndAadharCard' method available inside 'IDataService'
	 */
	@Override
	public DataModel findByPancardAndAadharCard(String pancard, String aadharCard) {

		return iDataModelRepository.findByPanCardAndAadharCard(pancard, aadharCard);

	}

}
