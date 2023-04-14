package com.robert.loginandreg.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.robert.loginandreg.models.LoginUser;
import com.robert.loginandreg.models.User;
import com.robert.loginandreg.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepo;
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepo.save(user);
	}
	
	public User getUser(String email) {
		Optional<User> potentialUser = userRepo.findByEmail(email);
		return potentialUser.isPresent() ? potentialUser.get(): null;
	}
	
	public User getUser(Long id) {
		Optional<User> potentialUser = userRepo.findById(id);
		return potentialUser.isPresent() ? potentialUser.get(): null;
	}
	
	public User login(LoginUser loginUser, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		User existingUser = this.getUser(loginUser.getEmail());
		if(existingUser == null) {
			result.rejectValue("email", "Unique", "Invalid");
			return null;
		}
		
		if(!BCrypt.checkpw(loginUser.getPassword(), existingUser.getPassword())) {
			result.rejectValue("email", "Unique", "Invalid");
			return null;
		}
		return existingUser;
	}

}
