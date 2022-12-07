package com.search.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.search.data.model.DataModel;
import com.search.data.service.IDataService;

@RestController
public class DataController {

	@Autowired
	private IDataService iDataService;
	
	/**
	 * This API is to check whether 'User' already exists or not using Pan-Card
	 */
	@GetMapping("/getByPancard")
	public String getByPancard(@RequestBody DataModel data) {

		DataModel newModel = iDataService.findByPancard(data.getPanCard());

		if (newModel != null) {
			return "User exists already";
		} else {
			return "No record found";
		}
	}

	/**
	 * This API is to check whether 'User' already exist or not using Pan-card and Aadhar-Card 
	 */
	@GetMapping("/getByPanAndAadharCard")
	public String getByPanAndAadhar(@RequestBody DataModel data) {

		DataModel newModel = iDataService.findByPancardAndAadharCard(data.getPanCard(), data.getAadharCard());

		if (newModel != null) {
			return "User exists already";
		} else {
			return "No record found";
		}
	}

	
	/**
	 * This API is to add data into data base 
	 */
	@PostMapping("/addData")
	public String addData(@RequestBody DataModel data) {

		return iDataService.addUserData(data); 
	}

}
