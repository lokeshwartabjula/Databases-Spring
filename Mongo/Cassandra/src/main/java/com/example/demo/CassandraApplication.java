package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Catalog;
import com.example.demo.services.CatalogService;

@SpringBootApplication
public class CassandraApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(CassandraApplication.class, args);
	
		CatalogService service=ctx.getBean(CatalogService.class);
		Catalog catalog= ctx.getBean(Catalog.class);
		
		catalog.setId(905);
		catalog.setCatalogName("cableTV");
		catalog.setValidity("30days");
		catalog.setAmount(169);
				
		service.add(catalog);
	}
	
	@Bean
	public Catalog catalog() {
		return new Catalog();
	}

}
