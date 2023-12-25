package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.collections.Employee_details;

@Repository
public interface Employee_repo extends MongoRepository<Employee_details, String>{

	@Query(value = "{'age' :{'$gte' :27}}")
	public List<Employee_details> getByAge();
	
	@Query(value = "{'$and' : [{'departments': 'IT'},{'address.country': 'JAPAN'}]}")
	public List<Employee_details> getDetailsbyDepartments();
}
