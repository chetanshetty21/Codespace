package com.xworkz.assocation1.things.assocation311022;

public class Country {

	public String name;
	public double noOfStates;
	public double population;
	public String presidentNmae;
	public Country(String name, double noOfStates, double population, String presidentNmae) {
		super();
		this.name = name;
		this.noOfStates = noOfStates;
		this.population = population;
		this.presidentNmae = presidentNmae;
	} 
	
	public void showOff() {
		
		System.out.println("name of the country="+name);
		System.out.println("name of the noOfStates="+noOfStates);
		System.out.println("name of the population="+population);
		System.out.println("name of the presidentNmae="+presidentNmae);
	}
	
}
