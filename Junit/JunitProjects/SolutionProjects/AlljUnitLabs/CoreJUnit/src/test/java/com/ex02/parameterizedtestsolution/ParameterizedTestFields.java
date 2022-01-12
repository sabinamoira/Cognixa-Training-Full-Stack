package com.ex02.parameterizedtestsolution;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;



public class ParameterizedTestFields {

	private int m1;
	private int m2;
	private int result;
	
	public ParameterizedTestFields(int m1, int m2, int result) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.result = result;
	}


	// creates the test data
	
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
		return Arrays.asList(data);
	}

	@Test
	public void testMultiplyException() {
		Calc calc = new Calc();
		//assertEquals("Result", result, calc.multiply(m1, m2));
	}

}