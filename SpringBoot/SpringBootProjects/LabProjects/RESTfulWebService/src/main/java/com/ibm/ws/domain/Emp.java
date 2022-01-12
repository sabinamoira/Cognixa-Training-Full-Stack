package com.ibm.ws.domain;

public class Emp {


	private int empId;
	private String fullName;
	
	public Emp(int empId, String fullName) {
		super();
		this.empId = empId;
		this.fullName = fullName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
