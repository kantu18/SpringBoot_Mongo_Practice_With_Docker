package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "MongoDB_Application",version = "8.0",description = "Manages API's for Employee_details for MongoDB"))
public class SpringBootMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
	}

}
