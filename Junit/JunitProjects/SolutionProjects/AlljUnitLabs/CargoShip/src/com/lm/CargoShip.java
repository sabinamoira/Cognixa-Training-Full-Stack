package com.lm;

import java.util.ArrayList;
import java.util.List;

public class CargoShip {
	private int capacity;
	private List<CrewMember> members = new ArrayList<>();

	public CargoShip(int capacity) {
		if (capacity <= 0) {
			throw new ImpossibleCargoShipException("Capacity cannot be negative");
		}
		this.capacity = capacity;
	}

	public void addMember(CrewMember c) {
		if (this.capacity == this.members.size()) {
			throw new CargoShipFullException("No more space");
		}
		this.members.add(c);
	}

	public void removeMember(CrewMember c) {
		if (!this.members.contains(c)) {
			throw new MemberNotFoundException("Not found");
		}
		this.members.remove(c);
	}

	public int getCapacity() {
		return this.capacity;
	}

	public int getAvailableSpace() {
		return this.capacity - this.members.size();
	}
	
	public int getCrewCount() {
		return this.members.size();
	}

}
