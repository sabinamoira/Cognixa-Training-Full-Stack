package com.springboot.h2db.controllers;
import com.springboot.h2db.dao.*;
import com.springboot.h2db.domain.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	UserRepository repo;

	
	
	@RequestMapping("/users")
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	
	@RequestMapping("/users/{userId}")
	public User getUserById(@PathVariable int userId){
		return repo.findUserById(userId);
	}


	@RequestMapping(value="/users", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public User createUser(@RequestBody User user){
		return repo.create(user);
	}
}



