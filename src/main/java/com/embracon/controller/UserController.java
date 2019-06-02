package com.embracon.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.embracon.model.Dream;
import com.embracon.model.User;
import com.embracon.service.UserService;

@RestController
@RequestMapping("/v1/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@CrossOrigin(origins = "*")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@Validated @RequestBody  @Valid User users) {
		User response = service.createUsers(users);
		return response;
	}
	
	
	@CrossOrigin(origins = "*")
	@GetMapping
	public List<User> listUsers() {
        return service.listUsers();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/getDreams")
	public List<Dream> listDreams(){
	 List<Dream> dreams = new ArrayList<Dream>();;	
		
	 service.listUsers().forEach(l ->{
		 dreams.addAll(l.getDreams()); 
		});
	 return dreams;
	}
	
	
	
	@CrossOrigin(origins = "*")
	@PostMapping("/createDream/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Dream createDream(@PathVariable(name = "id", required = false) String id,@Validated @RequestBody  @Valid Dream dream) {
		
		service.listUsers().forEach(u ->{
			if(u.getId().equals(id)) {
				dream.setId(UUID.randomUUID().toString().toUpperCase());
				u.getDreams().add(dream);
				service.createUsers(u);
			}
		});
		return dream;
	}

}
