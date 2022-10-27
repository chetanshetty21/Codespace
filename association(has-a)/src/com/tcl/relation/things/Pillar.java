package com.tcl.relation.things;

import com.tcl.relation.enumber.Shape;

public class Pillar {

	public String id;
	public String place;
	public double height;
	public Shape shape = Shape.TAPPINGPILLARS;
	public String support;
	public Company company;

	public Pillar(String id, String place, double height, Shape shape, String support) {
		super();
		this.id = id;
		this.place = place;
		this.height = height;
		this.shape = shape;
		this.support = support;

	}

	public void showThings() {
		System.out.println("id =" + this.id);
		System.out.println("place =" + this.place);
		System.out.println("support=" + this.height);
		System.out.println("shape=" + this.shape);

		Company company = new Company("Pillars 360 Private Limited", "Four Pillars");
		company.showOff();

	}

}
