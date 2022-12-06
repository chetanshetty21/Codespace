package com.classmate.abstraction.things;

public abstract class Person extends Object {

	private String Name;
	private int age;
	private double PHNo;
	private String gender;
	private double height;

	public Person(String name, int age, double pHNo, String gender, double height) {
		super();
		Name = name;
		this.age = age;
		PHNo = pHNo;
		this.gender = gender;
		this.height = height;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPHNo() {
		return PHNo;
	}

	public void setPHNo(double pHNo) {
		PHNo = pHNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void eat() {
		System.out.println("always to eat ");
	}

	public void sleep() {
		System.out.println();

	}
}
