package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.collections.Employee_details;
import com.example.demo.service.Employee_Service;

@RestController
@RequestMapping("/mongoapi")
public class Employee_controller {

	@Autowired
	private Employee_Service service;
	
	@GetMapping("/getall")
	public ResponseEntity<List<Employee_details>> getAllEmployess()
	{
		return new ResponseEntity<>(service.getAllEmployees(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee_details> saveRecords(@RequestBody Employee_details details)
	{
		return new ResponseEntity<>(service.saveemployees(details),HttpStatus.CREATED);
	}
	
	@GetMapping("/findbyId/{emp_id}")
	public ResponseEntity<Optional<Employee_details>> findEmployees(@PathVariable String emp_id)
	{
		return new ResponseEntity<>(service.findById(emp_id),HttpStatus.OK);
	}
	
	@GetMapping("/findbyAge")
	public ResponseEntity<List<Employee_details>> findEmployeesbyAge()
	{
		return new ResponseEntity<>(service.getEmpbyAge(),HttpStatus.OK);
	}
	
	@GetMapping("/findbyDepartments")
	public ResponseEntity<List<Employee_details>> findEmployeesbyDepartments()
	{
		return new ResponseEntity<>(service.getEmpbydepartments(),HttpStatus.OK);
	}

	
}
