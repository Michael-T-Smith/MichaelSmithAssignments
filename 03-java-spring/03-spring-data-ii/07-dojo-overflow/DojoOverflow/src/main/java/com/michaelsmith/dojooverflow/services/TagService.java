package com.michaelsmith.dojooverflow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsmith.dojooverflow.repository.TagRepository;

@Service
public class TagService {
	@Autowired
	TagRepository tRepo;
}
