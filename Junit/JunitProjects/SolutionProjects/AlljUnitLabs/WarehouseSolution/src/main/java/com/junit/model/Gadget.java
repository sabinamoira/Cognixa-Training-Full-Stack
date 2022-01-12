package com.junit.model;


public class Gadget extends Product {
	private int packSize;

	public Gadget(String description, int unitPrice, int packSize) {
		super(description, unitPrice);
		this.packSize = packSize;
	}

	@Override
	public int getValue() {
		return this.getUnitPrice() * this.packSize;
	}
}
