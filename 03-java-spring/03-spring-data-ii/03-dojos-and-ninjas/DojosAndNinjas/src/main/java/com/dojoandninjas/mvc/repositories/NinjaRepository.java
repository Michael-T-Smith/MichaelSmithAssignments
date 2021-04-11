package com.dojoandninjas.mvc.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojoandninjas.mvc.models.Ninja;


public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
}
