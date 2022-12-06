package com.search.data.service;

import org.springframework.stereotype.Service;


import com.search.data.model.DataModel;
@Service
public interface IDataService {

	public String addUserData(DataModel data);
	
	public DataModel findByPancard(String pancard);
	
	public DataModel findByPancardAndAadharCard(String pancard, String AadharCard);

}
