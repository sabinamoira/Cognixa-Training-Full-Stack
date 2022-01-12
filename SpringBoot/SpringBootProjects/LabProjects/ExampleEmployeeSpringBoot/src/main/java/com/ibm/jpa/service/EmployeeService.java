package com.ibm.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.jpa.domain.Employee;
import com.ibm.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public void addEmployee(Employee employee) {
		repository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return (List<Employee>) repository.findAll();
	}

	public Employee getEmployeeById(Long id) {
		Optional<Employee> optionalemployee = repository.findById(id);
		return optionalemployee.orElseThrow(() -> new RuntimeException("Could mot find any employees"));
	}

	public void deleteEmployeeById(Long id) {
		repository.deleteById(id);
	}

	public List<Employee> getEmployeeByName(String name) {
		return repository.findByName(name);
	}

	public void updateEmployee(Long empId, Employee emp) {
		Optional<Employee> optionalemployee = repository.findById(empId);
		optionalemployee.orElseThrow(() -> new RuntimeException("Could mot find any employees"));
		emp.setId(empId);
		repository.save(emp);
	}
}
