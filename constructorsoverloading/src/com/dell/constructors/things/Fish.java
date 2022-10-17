package com.dell.constructors.things;

//
public class Fish {
	public String name;
	public char type;
	public double price;
	public float weight;
	public long length;

	public Fish(String name) {
		this.name = name;
		System.out.println("fish name=" + name);
	}

	public Fish(char type) {

		this.type = type;
		System.out.println("iam the type of");

	}

	public Fish(double price) {
		this.price = price;
		System.out.println("my price is");
	}

	public Fish(float weight) {

		this.weight = weight;
		System.out.println("my weight is");
	}

	public Fish(long length) {

		this.length = length;
		System.out.println("my long is");

	}

	public Fish(String name, double price) {
		this.name = name;
		this.price = price;
		System.out.println("my name and price  is");
	}

	public Fish(String name, float weight) {
		this.name = name;
		this.weight = weight;
		System.out.println("my name and weight is");
	}

	public Fish(String name, long length) {
		this.name = name;
		this.length = length;
		System.out.println("my name and long is");
	}

	public Fish(float weight, long length) {
		this.weight = weight;
		this.length = length;
		System.out.println("my name and weight is");
	}
}
