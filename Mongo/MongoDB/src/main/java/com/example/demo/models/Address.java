package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "address")
public class Address {

	private int houseNo;
	private String street;
	private String city;
	private long pincode;
}
