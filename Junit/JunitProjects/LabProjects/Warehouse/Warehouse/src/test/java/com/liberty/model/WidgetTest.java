package com.liberty.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class WidgetTest {

	Widget w1 = null;
	Widget w2 = null;
	Widget w3 = null;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("In BeforeAll");
	}

	@BeforeEach
	public void setUp() {
		System.out.println("In BeforeEach");
		w1 = new Widget("toy", 13, LocalDate.of(2017, 1, 13));
		w2 = new Widget("watch", 89, LocalDate.of(2021, 8, 15));
		w3 = new Widget("watch", 45, LocalDate.now().plusDays(1) );
	}

	@Test
	public void getValueisExpiredTest() {
		boolean w1isExpired = w1.isExpired();
		boolean w2isExpired = w2.isExpired();
		boolean w3isExpired = w3.isExpired();
		assertEquals(true, w1isExpired);
		assertEquals(false, w2isExpired);
		assertEquals(false, w3isExpired);
	}

	@Test
	public void getValueTest() {
		int w1Value = w1.getValue();
		int w2Value = w2.getValue();
		int w3Value = w3.getValue();
		assertEquals(0, w1Value);
		assertEquals(89, w2Value);
		assertEquals(45, w3Value);
	}

	@Test
	public void getUnitPriceTest() {
		int w1UnitPrice = w1.getUnitPrice();
		int w2UnitPrice = w2.getUnitPrice();
		assertEquals(13, w1UnitPrice);
		assertEquals(89, w2UnitPrice);
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("In AfterAll");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("In AfterEach");
	}

}