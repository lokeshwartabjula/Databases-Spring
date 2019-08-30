package com.example.demo.repos;

import java.util.List;

import org.springframework.stereotype.Repository;

//import com.example.demo.models.Car;

@Repository
public interface MyRepository<T> {

	public T save(T t);
	public List<T> findAll();
	public Long remove(T t);
}
