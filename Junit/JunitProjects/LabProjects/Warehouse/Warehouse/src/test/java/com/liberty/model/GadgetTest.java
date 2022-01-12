package com.liberty.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GadgetTest {
	
	Gadget g1 = null;
	Gadget g2 = null;

	
	@BeforeAll
	public static void beforeAll() {
	System.out.println("In BeforeAll");
	}
	
	@BeforeEach
	public void setUp() {
	System.out.println("In BeforeEach");
	 g1 = new Gadget("toy", 17, 3);
	 g2 = new Gadget("watch", 5, 8);
	}
	
	@Test
	public void getValueTest() {
		int g1Value = g1.getValue();
		int g2Value = g2.getValue();
		assertEquals(51, g1Value);
		assertEquals(40, g2Value);
	}
	
	@Test
	public void getUnitPriceTest() {
		int g1UnitPrice = g1.getUnitPrice();
		int g2UnitPrice = g2.getUnitPrice();
		assertEquals(17, g1UnitPrice);
		assertEquals(5, g2UnitPrice);
	}
	
	
	@AfterAll
	public static void afterAll() {
		System.out.println("In AfterAll");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("In AfterEach");
	}

}
