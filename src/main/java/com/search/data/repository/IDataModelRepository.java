package com.search.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.data.model.DataModel;
@Repository
public interface IDataModelRepository extends JpaRepository<DataModel, Integer>{

	/**
	 * This is the method coming from 'JpaRepository' to find User-data using 'PanCard'
	 */
	DataModel findByPanCard(String panCard);
	
	/**
	 * This is the method also coming from 'JpaRepository' to find User-data using both 'PanCard' and 'AadharCard'
	 */
	DataModel findByPanCardAndAadharCard(String panCard, String aadharCard);

}
