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
	

	
	@GetMapping("/getByPancard")
	public String getByPancard(@RequestBody DataModel dataModel) {

		DataModel newModel = iDataService.findByPancard(dataModel.getPanCard());
		
		if (newModel != null) {
			return "Pancard already exists";
		}
		else {
			return "Record not found";
		}
	}
	
	
	@GetMapping("/getByPanAndAadharCard")
	public String getByPanAndAadhar(@RequestBody DataModel dataModel) {
		
		DataModel newModel = iDataService.findByPancardAndAadharCard(dataModel.getPanCard(), dataModel.getAadharCard());
		
		System.out.println(newModel);
		
		if (newModel != null) {
			return "Pancard already exists";
		}
		else {
			return "Record not found";
		}
		
		
		
	}
	
	@PostMapping("/addData")
	public String addData(@RequestBody DataModel data) {
		
		return iDataService.addUserData(data);
	}

}
