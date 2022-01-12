package com.ibm.ws.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	public String getMessage() {
		return "How are you doing?";
	}

}
