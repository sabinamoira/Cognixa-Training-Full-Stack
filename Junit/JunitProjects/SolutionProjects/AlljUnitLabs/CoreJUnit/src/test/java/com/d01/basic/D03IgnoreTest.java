package com.d01.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class D03IgnoreTest {

    @Test
    public void testMath1() {
        assertEquals(1 + 1, 2);
    }

    @Disabled("TestMath2 is ignored")
    @Test
    public void testMath2() {
        assertEquals(1 + 2, 5);
    }

    @Disabled("some one please create a test for Math3!")
    @Test
    public void testMath3() {
        //...
    }

}