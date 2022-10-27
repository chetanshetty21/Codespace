package com.tcl.relation.things;

public class Company {

	public String name;
	public String type;
	public Company(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public  void showOff() {
		System.out.println("calling the company");
		System.out.println("company name="+this.name);
		System.out.println("company type="+this.type);
	}

}
