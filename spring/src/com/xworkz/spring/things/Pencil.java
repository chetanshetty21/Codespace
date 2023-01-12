package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("PencilName")
	protected String name;
	@Autowired
	@Qualifier("PencilType")
	protected String type;
	@Autowired
	@Qualifier("PencilPrice")
	protected int price;
	@Autowired
	@Qualifier("PencilColor")
	protected String color;
	@Autowired
	@Qualifier("PencilSharp")
	protected boolean sharp;
	@Autowired
	@Qualifier("PencilStolen")
	protected boolean stolen;

	public Pencil(String name, String type, int price, String color, boolean sharp, boolean stolen) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.color = color;
		this.sharp = sharp;
		this.stolen = stolen;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public boolean isSharp() {
		return sharp;
	}

	public boolean isStolen() {
		return stolen;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSharp(boolean sharp) {
		this.sharp = sharp;
	}

	public void setStolen(boolean stolen) {
		this.stolen = stolen;
	}

}
