package com.junit.warehouse;
import java.util.ArrayList;
import java.util.List;

import com.junit.exceptions.ImpossibleWarehouseException;
import com.junit.exceptions.WarehouseFullException;
import com.junit.model.Product;

public class Warehouse {
	private int capacity;
	private List<Product> inventory = new ArrayList<>();

	public Warehouse(int capacity) {
		if (capacity < 1) {
			throw new ImpossibleWarehouseException("capacity cannot be less than 1");
		}
		this.capacity = capacity;
	}

	public void addProduct(Product p) {
		if (getSpace() == 0) {
			throw new WarehouseFullException("Warehouse is full");
		}
		inventory.add(p);
	}
	
	
	public void removeProduct(Product p) {
		if (!inventory.contains(p)) {
			throw new IllegalStateException("Warehouse does not contain product");	
		} 
		inventory.remove(p);
	}

	public int getCapacity() {
		return this.capacity;
	}

	public int getSpace() {
		return this.capacity - inventory.size();
	}

	public int getTotalValue() {
		int total = 0;
		for (Product p : inventory) {
			total += p.getValue();
		}
		return total;
	}

}
