package com.michaelsmith.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsmith.dojooverflow.models.Question;
import com.michaelsmith.dojooverflow.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository qRepo;
	
	public List<Question> allQuestions() {
		return this.qRepo.findAll();
	}
	
	public Question saveQuestion(Question question) {
		return this.qRepo.save(question);
	}
	
	public Question findQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
}
