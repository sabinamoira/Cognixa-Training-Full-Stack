package com.d01.basic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class D02JunitAssertions {
	@Test
	public void whenAssertingEquality_thenEqual() {
	    String expected = "Rohan";
	    String actual = "Rohan";
	 
	    assertEquals(expected, actual);
	}
	
	@Test
	public void whenAssertingArraysEquality_thenEqual() {
	    char[] expected = {'J','u','n','i','t'};
	    char[] actual = "Junit".toCharArray();
	     
	    assertArrayEquals(expected, actual);
	}
	
	@Test
	public void givenNullArrays_whenAssertingArraysEquality_thenEqual() {
	    int[] expected = null;
	    int[] actual = null;
	 
	    assertArrayEquals(expected, actual);
	}
	
	@Test
	public void whenAssertingNull_thenTrue() {
	    Object car = null;
	     
	    assertNull(car, "The car should be null");
	}
	
	@Test
	public void whenAssertingNotSameObject_thenDifferent() {
	    Object cat = new Object();
	    Object dog = new Object();
	 
	    assertNotSame(cat, dog);
	}
	
	@Test
	public void whenAssertingConditions_thenVerified() {
	    assertTrue(5 > 4, "5 is greater then 4");
	    assertFalse(5 > 6, "5 is not greater then 6");
	}
	
	

	
}
