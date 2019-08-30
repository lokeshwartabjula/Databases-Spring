package com.example.demo.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.example.demo.models.Address;
import com.example.demo.models.Car;
import com.example.demo.models.Owner;
import com.mongodb.MongoClient;

//import com.mongodb.client.MongoClient;

@Configuration
public class AppConfig {

	@Bean
	public MongoClient client() {
		return  new MongoClient("localhost");
	}
	
	@Bean
	public MongoTemplate template() {
		return new MongoTemplate(client(),"training");
	}
	@Bean
	public Address address() {
		return new Address(420,"Ha Ha Ha","ScamCity",42069);
	}
	@Bean
	public Owner owner() {
		return new Owner(666,"Devil",address());
	}
	@Bean
	public Car car() {
		Car car=new Car();
		car.setBrand("Skoda");
		car.setModel(Arrays.asList("Octavia","Fabia","Laura"));
		car.setOwner(owner());
//		byte[] bytes=
//		car.setId(new ObjectId(bytes));
		return car;
	}

}
