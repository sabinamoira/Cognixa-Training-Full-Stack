package com.d01.basic;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class D01UsingTestFixtures {

	    // Run once, e.g. Database connection, connection pool
	    @BeforeAll
	    public static void runOnceBeforeClass() {
	        System.out.println("@BeforeClass - runOnceBeforeClass");
	    }

	    // Run once, e.g close connection, cleanup
	    @AfterAll
	    public static void runOnceAfterClass() {
	        System.out.println("@AfterClass - runOnceAfterClass");
	    }

	    // Should rename to @BeforeTestMethod
	    // e.g. Creating an similar object and share for all @Test
	    @BeforeEach
	    public void runBeforeTestMethod() {
	        System.out.println("@Before - runBeforeTestMethod");
	    }

	    // Should rename to @AfterTestMethod
	    @AfterEach
	    public void runAfterTestMethod() {
	        System.out.println("@After - runAfterTestMethod");
	    }

	    @Test
	    public void test_method_1() {
	        System.out.println("@Test - test_method_1");
	    }

	    @Test
	    public void test_method_2() {
	        System.out.println("@Test - test_method_2");
	    }

	

}
