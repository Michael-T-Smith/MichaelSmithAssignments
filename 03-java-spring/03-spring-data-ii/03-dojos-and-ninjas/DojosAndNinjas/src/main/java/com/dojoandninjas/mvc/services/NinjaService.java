package com.dojoandninjas.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dojoandninjas.mvc.models.Ninja;
import com.dojoandninjas.mvc.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private NinjaRepository nRepo;
	public NinjaService(NinjaRepository repo) {
		this.nRepo = repo;
	}
	
	public List<Ninja> getAllNinjas() {
		return this.nRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
}
