package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.collections.Employee_details;
import com.example.demo.repository.Employee_repo;

@Service
public class Employee_Service {

	@Autowired
	private Employee_repo employee_repo;
	
	
	public List<Employee_details> getAllEmployees()
	{
		return employee_repo.findAll();
	}
	
	public Employee_details saveemployees(Employee_details emDetails)
	{
		return employee_repo.save(emDetails);
	}
	
	public Optional<Employee_details> findById(String emp_id)
	{
		return employee_repo.findById(emp_id);
	}
	
	public List<Employee_details> getEmpbyAge()
	{
		return employee_repo.getByAge();
	}
	
	public List<Employee_details> getEmpbydepartments()
	{
		return employee_repo.getDetailsbyDepartments();
	}
}
