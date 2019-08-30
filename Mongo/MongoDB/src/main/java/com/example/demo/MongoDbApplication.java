package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.models.Car;
import com.example.demo.repos.MyRepository;

@SpringBootApplication
public class MongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(MongoDbApplication.class, args);
		MyRepository<Car> repo=ctx.getBean(MyRepository.class);
		Car car=ctx.getBean(Car.class);
		Car saved=repo.save(car);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+saved.toString());
	}

}
