package com.example.demo.collections;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Hobbies {
	
	private String hobby_name;
	private String category;
}
