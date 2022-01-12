package com.lm;

public class Officers extends CrewMember{
	private String rank;

	public Officers(int id, String name, int age, String status, String rank) {
		super(id, name, age, status);
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Officers [rank=" + rank + ", toString()=" + super.toString() + "]";
	}

	

	
	
}
