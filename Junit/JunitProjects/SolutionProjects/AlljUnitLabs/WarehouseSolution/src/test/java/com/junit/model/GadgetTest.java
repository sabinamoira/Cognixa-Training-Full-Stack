package com.junit.model;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/*
 * There is no requirement to create this test class, but doing so makes the Warehouse tests much simpler
 * and more reliable.
 */
class GadgetTest {

	@Test
	void testNormaliseScale() {
		Product g = new Gadget("A description", 10, 10);
		Product expected = new Gadget("A description", 10, 10);
		assertEquals(expected, g);
	}

	@Test
	void testGadgetValue1() {
		Gadget g = new Gadget("A description", 10, 10);
		assertEquals(new BigDecimal("100.00"), g.getValue());
	}

	@Test
	void testGadgetValue2() {
		Gadget g = new Gadget("A description", 11, 12);
		assertEquals(new BigDecimal("132.00"), g.getValue());
	}


}
