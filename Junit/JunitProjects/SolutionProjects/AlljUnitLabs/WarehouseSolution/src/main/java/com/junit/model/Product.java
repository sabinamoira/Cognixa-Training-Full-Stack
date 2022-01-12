package com.junit.model;

public abstract class Product {

	private String description;
	private int unitPrice;
	
	public abstract int getValue();


	public int getUnitPrice() {
		return unitPrice;
	}


	public Product(String description, int unitPrice) {
		super();
		this.description = description;
		this.unitPrice = unitPrice;
	}

	
}