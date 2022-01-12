package com.ibm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class EmployeeTest {
	Employee e1 = null;
	Employee e2 = null;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("In BeforeAll");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("In BeforeEach");
		e1 = new Employee("rohan", "rajore");
		e2 = new Employee("john", "doe");
	}
	
	
	@Test
	public void getFullNameTest() {
		System.out.println("In Test Method1");
		String name = e1.getFullName();
		assertEquals("rohan rajore", name);
	}
	
	@Test
	public void getFullNameSecondTest() {
		System.out.println("In Test Method2");
		String name = e2.getFullName();
		assertEquals("john doe", name);
	}
	
	
	@Test
	public void squareTest() {
		System.out.println("In Test Method3");
		int value = e2.square(5);
		int value2 = e2.square(7);
		assertEquals(25, value);
		assertEquals(49, value2);
	}
	
	@Test
	public void divisionTest1() {
		System.out.println("In Test Method4");
		int value = e2.divide(8,2);
		assertEquals(4, value);
	}
	
	@Test
	public void divisionTest2() {
		System.out.println("In Test Method5");
		Exception ex = assertThrows(ArithmeticException.class, () -> {
			e2.divide(8,0);
		});
		
		assertEquals(ex.getMessage(), "/ by zero");
		
	}
	
	@Test
	void timeoutExceeded() {
		assertTimeout(Duration.ofMillis(10), () -> {
			Thread.sleep(5);
		});
	}
	
	 @ParameterizedTest(name = "#{index} - Run test with args={0}")
	 @ValueSource(ints = {1, 2, 3, 5})
	 void test_int_arrays_custom_name(int arg) {
	        assertTrue(arg > 0);
	 }
	 
	 @ParameterizedTest
	    @CsvSource({
	            "java,      4",
	            "clojure,   7",
	            "python,    6"
	    })
	    void test_csv(String str, int length) {
	        assertEquals(length, str.length());
	    }
	
	@AfterEach
	public void tearDown() {
		System.out.println("In AfterEach");
		e1 = null;
		e2 = null;
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("In AfterAll");
	}
	
	
	
//	@Test
//	public void doublesTest() {
//		
//
//		double value = 1.0999999999999999;
//		System.out.println(value);
//		double value2 = 1.1;
//		System.out.println(value2);
//		assertEquals(value, value2);
//		
//	}
	
	

}
