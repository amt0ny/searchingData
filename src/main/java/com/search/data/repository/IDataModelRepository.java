package com.search.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.data.model.DataModel;
@Repository
public interface IDataModelRepository extends JpaRepository<DataModel, Integer>{

	DataModel findByPanCard(String panCard);
	
	DataModel findByPanCardAndAadharCard(String panCard, String aadharCard);

}
