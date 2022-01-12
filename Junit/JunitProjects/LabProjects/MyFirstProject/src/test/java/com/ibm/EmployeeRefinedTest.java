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

public class EmployeeRefinedTest {
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
	public void divisionTest1() {
		System.out.println("In Test Method4");
		int value = e2.divide(8,2);
		assertEquals(4, value);
	}
	
	@Test
	public void divisionTest2() {
		System.out.println("In Test Method5");
		Exception ex = assertThrows(ArithmeticException.class, () -> {
			e2.divide(8, 0);
		});
		
		System.out.println(ex.getMessage());
		assertEquals(ex.getMessage(), "/ by zero");
		
	}
	
	
	
	
	@Test
	public void getFullNameTest() {
		//Employee e1 = new Employee("rohan", "rajore");
		String name = e1.getFullName();
		assertEquals("rohan rajore", name);
	}
	
	@Test
	public void getFullNameSecondTest() {
		//Employee e1 = new Employee("john", "doe");
		String name = e2.getFullName();
		assertEquals("john doe", name);
	}
	
	@Test
	public void getHireDateTest() {
		//Employee e1 = new Employee("jane", "doe");
		e1.setHireDate("Aug 1st");
		String hireDate = e1.getHireDate();
		assertEquals("Aug 1st", hireDate);
	}
	
	@Test
	public void getSquareTest() {
		//Employee e1 = new Employee(null, null);
		int num = e1.getSquare(3);
		int num2 = e1.getSquare(3433);
		assertEquals(3*3, num);
		assertEquals(3433*3433, num2);
	}
	
	@Test
	 void timeoutExceeeded() {
		assertTimeout(Duration.ofMillis(10), () -> {
			Thread.sleep(5);
		});
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("In AfterAll");
	}
	
	@ParameterizedTest(name = "#{index} - Run test with args={0}")
	@ValueSource(ints = {1, 2, 3, 5})
	void test_int_array_custom_name(int arg) {
		assertTrue(arg > 0);
	}


	@ParameterizedTest
		@CsvSource({
			"java, 4",
			"clojure, 7",
			"python, 6"
		})
	void test_csv(String str, int length) {
		assertEquals(length, str.length());
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("In AfterEach");
	}
	
}
