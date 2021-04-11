package com.dojoandninjas.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dojoandninjas.mvc.models.Dojo;


public interface DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}
