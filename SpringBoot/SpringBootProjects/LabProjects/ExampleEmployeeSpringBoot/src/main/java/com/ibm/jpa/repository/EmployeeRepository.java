package com.ibm.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ibm.jpa.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	@Query(value = "select * from books where name = ?",
			nativeQuery = true)
	List<Employee> findByName(String name);
	
}
