package com.lm;

public class Seaman extends CrewMember {
	private String description;

	public Seaman(int id, String name, int age, String status, String description) {
		super(id, name, age, status);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Seaman [description=" + description + ", toString()=" + super.toString() + "]";
	}
	
}
