package com.embracon.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.embracon.model.User;
import com.embracon.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User createUsers(User user) {
		return repository.save(user);
	}
	
	
	public List<User> listUsers() {
		return  repository.findAll();
	}
	
	public User addUser(User user) {
		List<User> u = repository.findAll();
		u.add(user);
		User response = new User();
		response.setId(UUID.randomUUID().toString().toUpperCase());
		return repository.save(response);
	}
	
	
	
	

}
