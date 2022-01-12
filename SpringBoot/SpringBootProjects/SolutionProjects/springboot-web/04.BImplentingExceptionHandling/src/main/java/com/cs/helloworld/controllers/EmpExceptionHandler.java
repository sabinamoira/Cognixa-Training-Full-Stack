package com.cs.helloworld.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cs.helloworld.exceptions.NoEmployeesException;

@RestControllerAdvice
public class EmpExceptionHandler {

	@ExceptionHandler(NoEmployeesException.class)
	public ResponseEntity<Object> handleNonExistingEmp(NoEmployeesException exception) {
		return new ResponseEntity<>("Employees not found", HttpStatus.NOT_FOUND);
	}
}
