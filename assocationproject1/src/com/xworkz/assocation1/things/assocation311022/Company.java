package com.xworkz.assocation1.things.assocation311022;

public class Company {
	public String name;
	public String ownerName;
	public Address adress;
	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	public void SetAddress(Address adress) {
		this.adress=adress;
		
	}
	}
