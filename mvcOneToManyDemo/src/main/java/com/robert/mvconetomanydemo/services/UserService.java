package com.robert.mvconetomanydemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.mvconetomanydemo.models.Donation;
import com.robert.mvconetomanydemo.models.User;
import com.robert.mvconetomanydemo.repositories.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepo;
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public User getOne(Long id) {
		Optional<User> user = userRepo.findById(id);
		return user.isPresent() ? user.get() : null;
	}

	public List<User> getAll() {
		return (List<User>) userRepo.findAll();
	}

	public User create(User dojo) {
		return userRepo.save(dojo);
	}

	public User update(User dojo) {
		return userRepo.save(dojo);
	}

	public void delete(Long id) {
		userRepo.deleteById(id);
	}
	public User getOne(String email) {
		Optional<User> user = userRepo.findByEmail(email);
		return user.isPresent() ? user.get() : null;
	}

}
