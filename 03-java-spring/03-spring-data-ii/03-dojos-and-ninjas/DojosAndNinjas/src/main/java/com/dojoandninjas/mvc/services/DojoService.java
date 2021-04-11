package com.dojoandninjas.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dojoandninjas.mvc.models.Dojo;
import com.dojoandninjas.mvc.repositories.DojoRepository;

@Service
public class DojoService {
	
	private DojoRepository dRepo;
	public DojoService  (DojoRepository repo) {
		this.dRepo = repo;
	}
	
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	public List<Dojo> getAllDojos() {
		return this.dRepo.findAll();
	}
	
	public Dojo getDojoById(Long id){
		return dRepo.findById(id).orElse(null);
	}
}
