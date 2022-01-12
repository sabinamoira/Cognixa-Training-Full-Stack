package com.junit.model;



import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import com.junit.model.Product;
import com.junit.model.Widget;

/*
 * There is no requirement to create this test class, but doing so makes the Warehouse tests much simpler
 * and more reliable.
 */
class WidgetTest {
	
	@Test
	void testNormaliseScale() {
		Product w = new Widget("A description", 10, LocalDate.now());
		Product expected = new Widget("A description", 10, LocalDate.now());
		assertEquals(expected, w);
	}

	@Test
	void testWidgetValue1() {
		Product w = new Widget("A description", 10, LocalDate.now());
		assertEquals(new BigDecimal("10.00"), w.getValue());
	}

	@Test
	void testWidgetValue2() {
		Product w = new Widget("A description", 11, LocalDate.now());
		assertEquals(new BigDecimal("11.00"), w.getValue());
	}

	@Test
	void testWidgetValueExpired() {
		Product w = new Widget("A description", 10, LocalDate.now().minusDays(1));
		assertEquals(BigDecimal.ZERO, w.getValue());
	}


}
