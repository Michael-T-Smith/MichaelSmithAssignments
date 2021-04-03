package com.updateassignment.mvc.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.updateassignment.mvc.models.Language;
import com.updateassignment.mvc.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRepo;
	public LanguageService(LanguageRepository repo) {
		langRepo = repo;
	}
	
	public List<Language> allLanguages() {
		return langRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		return langRepo.findById(id).orElse(null);
	}
	public Language createLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	public Language updateLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	public void deleteLanguage(Long id) {
		langRepo.deleteById(id);
	}
}