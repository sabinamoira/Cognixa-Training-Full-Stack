package com.lm;

public class CrewMember {
	private int id;
	private String name;
	private int age;
	private String status;
	public CrewMember(int id, String name, int age, String status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CrewMember [id=" + id + ", name=" + name + ", age=" + age + ", status=" + status + "]";
	}

}
