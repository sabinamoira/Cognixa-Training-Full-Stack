package com.d02.testsuite;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterizedHelloUnitTest {
	int x;
	int y;
	int sum;

	public ParameterizedHelloUnitTest(int x, int y, int sum) {
		super();
		this.x = x;
		this.y = y;
		this.sum = sum;
	}

	@Parameters
	public static Collection<Object[]> regExValues() {
		return Arrays.asList(new Object[][] { { 1, 2, 3 }, { 100, 2, 101 }});
	}

	@Test
	public void test() {

		HelloUnit hello = new HelloUnit();
		assertEquals(hello.add(x,y), sum);
		//assertThat(hello.add(x,y), is(sum));
	}

}