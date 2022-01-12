package com.ibm.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.jpa.domain.Employee;
import com.ibm.jpa.service.EmployeeService;




@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/emps")
	public List<Employee> findAllEmployee() {
		return this.employeeService.getAllEmployees();
	}
	
	@PostMapping(value = "/emps")
	public void createEmployee(@RequestBody Employee Employee) {
		this.employeeService.addEmployee(Employee);
	}
	
	@GetMapping(value = "/emps/{id}")
	public Employee findEmployeeById(@PathVariable("id") Long id) {//does same thing: public Employee getById(@PathVariable Long id)
		return this.employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping(value = "/emps/{id}")
	public void deleteEmployeeById(@PathVariable Long id) {
		 this.employeeService.deleteEmployeeById(id);
	}
	
	@PutMapping(value = "/emps/{id}")
	public List<Employee> updateEmployee(@RequestBody Employee emp, @PathVariable Long id) {		
		this.employeeService.updateEmployee(id, emp);
		return this.employeeService.getAllEmployees();
	}
	
	//ADD Update Method

}
