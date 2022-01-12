package com.junit.warehouse;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.junit.model.Gadget;
import com.junit.model.Product;
import com.junit.model.Widget;

class WarehouseTest {

	private Product widget;
	private Product gadget;
	private Warehouse wh2;
	private Warehouse wh3;


	@Before
	void setUp() {
		widget = new Widget("a description", 10, LocalDate.now());
		gadget = new Gadget("a description", 10, 10);
		wh2 = new Warehouse(2);
		wh3 = new Warehouse(3);
	}
	
	@Test
	void testWarehouseCreation1() {
		assertEquals(2, wh2.getCapacity(), "Capacity should be 2");
		assertEquals(2, wh2.getSpace(), "Free space should be 2");
	}
	
	@Test
	void testWarehouseCreation2() {
		assertEquals(3, wh3.getCapacity(), "Capacity should be 3");
		assertEquals(3, wh3.getSpace(), "Free space should be 3");
	}

	@Test
	void testWarehouseCreationFail() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Warehouse(0);
		});
	}

	@Test
	void testWarehouseAddition() {
		wh2.addProduct(widget);
		assertEquals(1, wh2.getSpace(), "Free space should be 1");
		//assertTrue(wh2.containsProduct(widget), "Should contain added product");
	}
	
	@Test
	void testFullWarehouseAddition() {
		Warehouse wh1 = new Warehouse(1);
		wh1.addProduct(widget);
		assertThrows(IllegalStateException.class, () -> {
			wh1.addProduct(gadget);
		});
	}
	
	@Test
	void testWarehouseAdditionNullProduct() {
		assertThrows(NullPointerException.class, () -> {
			wh2.addProduct(null);
		});
	}
	
	@Test
	void testWarehouseRemoval() {
		wh2.addProduct(widget);
		wh2.addProduct(gadget);
		wh2.removeProduct(widget);
		assertEquals(1, wh2.getSpace(), "Free space should be 1");
//		assertFalse(wh2.containsProduct(widget), "Should not contain removed product");
//		assertTrue(wh2.containsProduct(gadget),"Should contain other product");
	}
	
	@Test
	void testWarehouseRemovalDoesNotExist() {
		assertThrows(IllegalStateException.class, () -> {
			wh2.addProduct(widget);
			wh2.removeProduct(gadget);			
		});
	}
	
	@Test
	void testWarehouseRemovalNullProduct() {
		assertThrows(NullPointerException.class, () -> {
			wh2.removeProduct(null);
		});
	}

	@Test
	void testWarehouseValue1() {
		wh2.addProduct(widget);
		wh2.addProduct(gadget);
		assertEquals(new BigDecimal("110.00"), wh2.getTotalValue());
	}
	
	@Test
	void testWarehouseValue2() {
		Product g = new Gadget("a description", 11, 12);
		wh2.addProduct(widget);
		wh2.addProduct(g);
		assertEquals(new BigDecimal("142.00"), wh2.getTotalValue());
	}
	
}
