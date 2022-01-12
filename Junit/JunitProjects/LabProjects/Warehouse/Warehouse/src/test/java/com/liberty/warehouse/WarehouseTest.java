package com.liberty.warehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.liberty.exceptions.ImpossibleWarehouseException;
import com.liberty.exceptions.WarehouseFullException;
import com.liberty.model.Product;

import java.time.LocalDate;

public class WarehouseTest {

	Warehouse w1 = null;
	Warehouse w2 = null;
	Warehouse w3 = null;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("In BeforeAll");
	}

	@BeforeEach
	public void setUp() {
		System.out.println("In BeforeEach");
		w1 = new Warehouse(30);
		w2 = new Warehouse(20);
		w3 = new Warehouse(0);
	}
	
	@Test
	public void setWarehouseTest() {
		System.out.println("In Test Method1");
		Exception ex = assertThrows(ImpossibleWarehouseException.class, () -> {
			Warehouse w = new Warehouse(-1);
		});
		System.out.println(ex.getMessage());
		assertEquals(ex.getMessage(), "capacity cannot be less than 1");		
	}

	@Test
	public void addProduct() {
		System.out.println("In Test Method2");
		Exception ex = assertThrows(WarehouseFullException.class, () -> {
			w3.addProduct(new Product("product", 15))
		});
		System.out.println(ex.getMessage());
		assertEquals(ex.getMessage(), "capacity cannot be less than 1");		
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