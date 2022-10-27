package com.tcl.relation.things;

public class Brand {


	public String name;
	public String gstNo;
	public String location;
	public String rating;

	public Brand(String name, String gstNo, String location, String rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.location = location;
		this.rating = rating;
	}

	public void showOff() {
		System.out.println(name);
		System.out.println(gstNo);
		System.out.println(location);
		System.out.println(rating);
	}

}
