package com.ibm.ws.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ws.services.HelloWorldService;

//USES SERVICES
@RestController
public class HelloWorldController {

	@Autowired
	HelloWorldService hws;
	
	@RequestMapping(
			value= "/hello",
			method = RequestMethod.GET)
	public String sayHello() {
		return hws.getMessage();
	}
	
	//USING PATH VARIABLES:
	
	// gets name value from URL
	// http://localhost:8080/hello/"insert name"
	// Example: http://localhost:8080/hello/Rohan
	@RequestMapping("/hello/{name}")
	public String sayHelloWithName(@PathVariable(value = "name") String name) {
		return "Hello " + name;
	}
	
	//can set the value of the location string
	//Example: http://localhost:8080/greeting?location="insert location"
	//Example: http://localhost:8080/greeting?location=New%20Jersey
	@RequestMapping("/greeting")
	public String sayHelloWithRequestParams(
			@RequestParam(value = "location", defaultValue = "New York") String location) {
		return "Hello I'm from " + location;
	}
	
}

//NO SERVICES 
//@RestController
//public class HelloWorldController {
//
//	@RequestMapping(
//			value= "/hello",
//			method = RequestMethod.GET)
//	public String sayHello() {
//		return "Hello World!";
//	}
//
//}

