package com.xworkz.assocation1.things.assocation311022;

public class City {
	public String name;
	public String ministerName;
	public double cityCodeNumber;
	public double areaInSqKm;
	public City(String name, String ministerName, double cityCodeNumber, double areaInSqKm) {
		super();
		this.name = name;
		this.ministerName = ministerName;
		this.cityCodeNumber = cityCodeNumber;
		this.areaInSqKm = areaInSqKm;
	}
	public void display() {
		
		System.out.println("name of the city"+name);
		System.out.println("ministerName of the city"+ministerName);
		System.out.println("cityCodeNumber is"+cityCodeNumber);
		System.out.println("areaInSqKm of the city"+areaInSqKm);
	}
	
}