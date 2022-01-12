package com.liberty.model;


import java.time.LocalDate;


public class Widget extends Product {
	private LocalDate expiration;

	public Widget(String description, int unitPrice, LocalDate expiration) {
		super(description, unitPrice);
		this.expiration = expiration;
	}	

	public boolean isExpired() {
		return (LocalDate.now().isAfter(expiration));
		
	}

	@Override
	public int getValue() {
		if(isExpired()) {
			return 0;
		}else {
			return this.getUnitPrice();
		}
	}

}
