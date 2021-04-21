package com.michaelsmith.dojooverflow.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.michaelsmith.dojooverflow.models.User;
import com.michaelsmith.dojooverflow.repository.UserRepository;

@Component
public class UserValidator {
	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			errors.rejectValue("password", "Match", "Passwords do not match.");
		}
	//Make sure email does not already exist
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email","UniqueEmail", "Email already exists");
		}
	}
}
