package com.michaelsmith.dojooverflow.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.michaelsmith.dojooverflow.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findAll();
	
	boolean existsByEmail(String email);
	User findByEmail(String email);
		
}
