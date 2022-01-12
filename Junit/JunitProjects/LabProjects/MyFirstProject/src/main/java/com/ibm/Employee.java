package com.ibm;

public class Employee {
	String fname;
	String lname;
	String hireDate;

	public Employee(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return this.fname + " " + this.lname;
	}

	public void setHireDate(String hireDate) {
		// TODO Auto-generated method stub
		this.hireDate = hireDate;
	}

	public String getHireDate() {
		// TODO Auto-generated method stub
		return this.hireDate;
	}

	public int getSquare(int i) {
		// TODO Auto-generated method stub
		return i*i;
	}

	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}
	
	

}
