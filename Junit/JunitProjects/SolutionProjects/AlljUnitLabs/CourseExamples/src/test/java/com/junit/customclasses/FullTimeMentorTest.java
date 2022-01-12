package com.junit.customclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.customclasses.FullTimeMentor;
import com.junit.customclasses.Mentor;

class FullTimeMentorTest {

	@Test
	void testFullName() {
		String expected = "Jane Doe";
		Mentor mentor = new FullTimeMentor("Jane", "Doe", 42.42);
		String actual = mentor.getFullName();
		assertEquals(expected, actual, "Full name should be Jane Doe");
	}

}
