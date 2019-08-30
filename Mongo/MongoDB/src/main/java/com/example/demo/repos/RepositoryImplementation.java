package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Car;
@Repository
public class RepositoryImplementation implements MyRepository<Car> {

	@Autowired
	private MongoTemplate template;
	
	@Override
	public Car save(Car t) {
		return template.save(t);
	}

	@Override
	public List<Car> findAll() {
		return template.findAll(Car.class);
	}
	
	@Override
	public Long remove(Car t) {
		return template.remove(t).getDeletedCount();
	}
	
}
