package com.ibm.ws.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ws.domain.Emp;
import com.ibm.ws.services.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService empServ;

	@RequestMapping(
			value="/emps",
			produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Emp> getAllEmps(){
		return this.empServ.getAllEmps();
	}
	
	@RequestMapping(
			value="/emps",
			method=RequestMethod.POST,
			consumes= {MediaType.APPLICATION_JSON_VALUE},
			produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Emp> createEmp(@RequestBody Emp e){
		return this.empServ.insertEmp(e);
	}
	
	@RequestMapping(
			value="/emps/{empid}",
			method = RequestMethod.DELETE,
			produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Emp> deleteEmp(@PathVariable("empid") int empid){
		return this.empServ.deleteEmp(empid);
	}
	
}
