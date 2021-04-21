package com.michaelsmith.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsmith.dojooverflow.models.Answer;
import com.michaelsmith.dojooverflow.repository.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	private AnswerRepository aRepo;
	
	public List<Answer> getAllAnswers() {
		return this.aRepo.findAll();
	}
	
	public Answer saveAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
}
