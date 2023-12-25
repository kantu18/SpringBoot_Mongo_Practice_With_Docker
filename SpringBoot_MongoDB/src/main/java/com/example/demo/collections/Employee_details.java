
package com.example.demo.collections;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "Employee_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee_details {

	@Id
	private String emp_id;
	private String emp_name;
	private int salary;
	private int age;
	private List<String> departments;
	private List<Address> address;
	private List<Hobbies> hobby;
}
