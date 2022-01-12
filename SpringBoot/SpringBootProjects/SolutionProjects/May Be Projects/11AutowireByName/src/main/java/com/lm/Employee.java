package com.lm;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	private String empName;
	@Autowired
	private Address address2;
	
//	@Autowired
//	private Address address2;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address) {
		this.address2 = address;
	}
}
