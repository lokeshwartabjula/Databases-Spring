package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Catalog;

@Service
public class CatalogService {

	@Autowired
	private CrudRepository<Catalog, Integer> repo;
	
	public Iterable<Catalog> findAll(){
		return this.repo.findAll();
	}
	
	public Catalog add(Catalog entity) {
		return this.repo.save(entity);
	}
	
	
}
