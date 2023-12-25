package com.example.demo.collections;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

	private String address;
	private String country;
	private int zip;
}
