package com.ibm.ws.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ibm.ws.exceptions.NoEmployeesException;

@RestControllerAdvice
public class EmpExceptionHandler {
	
	@ExceptionHandler(NoEmployeesException.class)
	public ResponseEntity<Object> handleException(NoEmployeesException exception){
		return new ResponseEntity<>("Employees not found", HttpStatus.BAD_GATEWAY);
	}

}
