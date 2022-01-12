package com.ibm.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ws.services.HelloWorldService;

@RestController
public class HelloWorldController {
	
	@Autowired
	HelloWorldService hws;
	
	@RequestMapping(
			value="/hello", 
			method=RequestMethod.GET)
	public String sayHello() {
		return hws.getMessage();
	}
	
	//Using Path Variables
	@RequestMapping("/hello/{name}")
	public String sayHelloWithName(
			@PathVariable(value = "name") String name) {
		return "Hello " + name;
	}
	
	@RequestMapping("/greeting")
	public String sayHelloWithRequestParams(
			@RequestParam(value="location", defaultValue="New York") String location) {
		return "Hello I'm from " + location; 
	}
}
