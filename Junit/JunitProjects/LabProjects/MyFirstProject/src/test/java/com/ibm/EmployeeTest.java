package com.ibm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class EmployeeTest {
	@Test
	public void getFullNameTest() {
		Employee e1 = new Employee("rohan", "rajore");
		String name = e1.getFullName();
		assertEquals("rohan rajore", name);
	}
	
	@Test
	public void getFullNameSecondTest() {
		Employee e1 = new Employee("john", "doe");
		String name = e1.getFullName();
		assertEquals("john doe", name);
	}
	
	@Test
	public void getHireDateTest() {
		Employee e1 = new Employee("jane", "doe");
		e1.setHireDate("Aug 1st");
		String hireDate = e1.getHireDate();
		assertEquals("Aug 1st", hireDate);
	}
	
	@Test
	public void getSquareTest() {
		Employee e1 = new Employee(null, null);
		int num = e1.getSquare(3);
		int num2 = e1.getSquare(3433);
		assertEquals(3*3, num);
		assertEquals(3433*3433, num2);
	}


	
	
}
