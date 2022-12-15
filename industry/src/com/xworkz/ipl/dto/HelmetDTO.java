package com.xworkz.ipl.dto;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.HelmetType;

public class HelmetDTO extends AbstractAudiDTO {
	private String brand;
	private HelmetType type;
	private Double price;
	private Color color;

	public HelmetDTO() {

	}

	public HelmetDTO(String brand, HelmetType type, Double price, Color color) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}
}
