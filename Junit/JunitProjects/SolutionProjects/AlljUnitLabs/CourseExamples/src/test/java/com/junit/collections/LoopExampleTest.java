package com.junit.collections;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.junit.collections.LoopExample;

class LoopExampleTest {

	@Test
	void test() {
		List<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("World");
		LoopExample.processWords(words);
		// no assertions, not really a test: just a driver
	}

}
