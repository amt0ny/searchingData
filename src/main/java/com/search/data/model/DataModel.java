package com.search.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataModel {

	@Id
	private Integer id;
	private String name;
	private String number;
	private String emailId;
	private String panCard;
	private String aadharCard;
	private String drivingLicence;
	private String bplId;
	private String address;

	public DataModel(String panCard, String aadharCard) {
		super();
		this.panCard = panCard;
		this.aadharCard = aadharCard;
	}

;

	public DataModel(String panCard) {
		super();
		this.panCard = panCard;
	}

}
