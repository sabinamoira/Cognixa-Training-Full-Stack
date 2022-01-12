package com.cs.helloworld.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cs.helloworld.domain.Emp;
import com.cs.helloworld.exceptions.NoEmployeesException;
import com.cs.helloworld.services.EmpService;



@RestController
public class EmpController {
	
	@Autowired
	EmpService eservice;
	
	//Sending Data to client and Content Negotiation using Accept header
	@RequestMapping(value="/emps", 
			produces={MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Emp> printEmp(){
		
		ArrayList<Emp> emps =  eservice.getAllEmps();
		if(emps.size() == 0){
			System.out.println("Hello");
			throw new NoEmployeesException();
		}
		return emps;
	}
	
	//Receiving data from client
	@RequestMapping(value="/emps", 
			method=RequestMethod.POST,
			consumes={MediaType.APPLICATION_JSON_VALUE}, 
			produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Emp> addEmp(@RequestBody Emp e){
		return eservice.insertEmp(e);
	}
	
	@DeleteMapping("/emps/{eid}")
	public ArrayList<Emp> deleteById(@PathVariable("eid") int id){
		return eservice.deleteById(id);
	}
	
	
}
