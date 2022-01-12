package com.junit.failingtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.failingtest.Mentor;

class MentorTest {

	@Test
	void testFullName() {
		String expected = "Jane Doe";
		Mentor mentor = new Mentor("Jane", "Doe");
		String actual = mentor.getFullName();
		assertEquals(expected, actual, "Full name should be Jane Doe");
	}

}
