package com.d01.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class D04ExceptionTesting {
	
	@Test
    void test_exception() {

        Exception exception = assertThrows(
            ArithmeticException.class, 
            () -> divide(1, 0));

        assertEquals("/ by zero", exception.getMessage());

        assertTrue(exception.getMessage().contains("zero"));

    }

    int divide(int input, int divide) {
        return input / divide;
    }

}
