package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("RubberName")
	protected String name;
	@Autowired
	@Qualifier("RubberType")
	protected String type;
	@Autowired
	@Qualifier("RubberPrice")
	protected int price;
	@Autowired
	@Qualifier("RubberColor")
	protected String color;
	@Autowired
	@Qualifier("RubberShape")
	protected String shape;
	@Autowired
	@Qualifier("RubberStolean")
	protected boolean stolean;
	@Autowired
	@Qualifier("RubberSize")
	protected char size;

	public Rubber(String name, String type, int price, String color, String shape, boolean stolean, char size) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.color = color;
		this.shape = shape;
		this.stolean = stolean;
		this.size = size;
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

	public String getShape() {
		return shape;
	}

	public boolean isStolean() {
		return stolean;
	}

	public char getSize() {
		return size;
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

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setStolean(boolean stolean) {
		this.stolean = stolean;
	}

	public void setSize(char size) {
		this.size = size;
	}

}
