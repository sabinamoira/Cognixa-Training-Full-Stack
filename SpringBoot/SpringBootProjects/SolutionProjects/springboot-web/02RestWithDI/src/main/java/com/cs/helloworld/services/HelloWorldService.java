package com.cs.helloworld.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	public String retrieveWelcomeMessage() {
		return "How are you Doing";
	}
}
