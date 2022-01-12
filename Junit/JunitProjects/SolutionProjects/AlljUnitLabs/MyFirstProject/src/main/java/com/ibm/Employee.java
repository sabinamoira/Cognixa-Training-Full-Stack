package com.ibm;

public class Employee {
	private String fname;
	private String lname;
	
	private Object temp;

	public Employee(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return this.fname + " " + this.lname;
	}

	public int square(int i) {
		// TODO Auto-generated method stub
		return i * i;
	}

	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}
	
	

}
