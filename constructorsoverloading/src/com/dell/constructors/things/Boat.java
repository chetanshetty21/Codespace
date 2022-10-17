package com.dell.constructors.things;

public class Boat {
	public String name;
	public char type;
	public float ownerNo;
	public String companyName;
	public double colorNo;

	public Boat(String name) {
		this.name = name;
	}

	public Boat(char type) {
		this.type = type;
	}

	public Boat(float ownerNo) {
		this.ownerNo = ownerNo;
	}

	public Boat(double colorNo) {
		this.colorNo = colorNo;
	}

	public Boat(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;

	}
	public Boat(String name, char type) {
		this.type = type;
		this.name = name;

	}
	public Boat(String name, float ownerNo) {
		this.ownerNo = ownerNo;
		this.name = name;

	}
	public Boat(String name, double colorNo) {
		this.name = name;
		this.colorNo = colorNo;

	}


}
