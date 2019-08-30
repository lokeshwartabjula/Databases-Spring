package com.example.demo.models;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Cars")
public class Car {

	@Id
	private String id;
	private String brand;
	private List<String> model;
	
	@DBRef(lazy = true)
	private Owner owner;
}
