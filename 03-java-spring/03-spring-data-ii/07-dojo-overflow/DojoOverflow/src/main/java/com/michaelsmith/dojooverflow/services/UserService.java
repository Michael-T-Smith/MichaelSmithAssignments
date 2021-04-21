package com.michaelsmith.dojooverflow.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsmith.dojooverflow.models.User;
import com.michaelsmith.dojooverflow.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository uRepo;
	
	//register user
	public User registerUser(User user) {
		//Generate the hash for the password
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		//set the hashed password on a users password field
		user.setPassword(hash);
		//Save the new password to the database
		return this.uRepo.save(user);
	}
	
	//Authenticate Users for login
	public boolean authenticateUser(String email, String password) {
		//Step 1 query for user by email
		User user = this.uRepo.findByEmail(email);
		
		if(user == null) {
			return false;
		}
		
		//Step 2 check provided email against email in db for user
		return BCrypt.checkpw(password, user.getPassword());
	}
	
	public User getByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	
	public User findById(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
	
}
