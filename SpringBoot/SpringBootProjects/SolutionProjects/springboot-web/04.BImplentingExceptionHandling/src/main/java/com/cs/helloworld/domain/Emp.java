package com.cs.helloworld.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Emp {
	private int empId;
	private String fullName;
	
	
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
	public Emp(int empId, String fullName) {
		super();
		this.empId = empId;
		this.fullName = fullName;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", fullName=" + fullName + "]";
	}

}
