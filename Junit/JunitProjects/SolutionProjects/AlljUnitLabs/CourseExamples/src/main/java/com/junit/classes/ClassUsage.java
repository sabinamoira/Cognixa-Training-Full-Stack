package com.junit.classes;

import com.junit.simpletest.Mentor;

public class ClassUsage {

	public static Object useClasses() {
		Object anything = new Mentor("John", "Smith");
		// sometime later
		anything = "Hello World";
		return anything;
	}
}
