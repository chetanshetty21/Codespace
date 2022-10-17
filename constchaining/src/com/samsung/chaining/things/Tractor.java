package com.samsung.chaining.things;

public class Tractor {

	public String name;
	public String brand;
	public int price;
	public String color;
	public double hp;
	public String modelNumber;

	public Tractor(String name) {
		this.name = name;

	}

	public Tractor(String name, String brand) {
		this(name);
		this.brand = brand;

	}

	public Tractor(String name,String brand, int price) {
		this(name, brand);
		this.price = price;

	}
	public Tractor(String name, String brand,String color,int price) {
		this(name, brand,price);
		this.color= color;
	}
	public Tractor(String name,String brand,String color,int price,double hp) {
		
		this(name,brand,color,price);
		this.hp=hp;
	}

	
	public Tractor(String name, String brand, String color, int price, double hp, String modelNumber) {

		this(name, brand, color, price, hp);
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.hp = hp;
		this.modelNumber = modelNumber;

	}
}
