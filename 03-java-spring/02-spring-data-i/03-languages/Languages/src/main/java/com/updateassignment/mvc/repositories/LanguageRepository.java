package com.updateassignment.mvc.repositories;

import org.springframework.stereotype.Repository;

import com.updateassignment.mvc.models.Language;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	
List<Language> findAll();

}
