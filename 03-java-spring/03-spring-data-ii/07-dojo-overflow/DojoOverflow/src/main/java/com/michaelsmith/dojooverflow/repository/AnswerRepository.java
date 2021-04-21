package com.michaelsmith.dojooverflow.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.michaelsmith.dojooverflow.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
	List<Answer> findAll();
}
