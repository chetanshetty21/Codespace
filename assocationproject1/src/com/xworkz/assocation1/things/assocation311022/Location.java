package com.xworkz.assocation1.things.assocation311022;

public class Location {
	public double no;
	public String Street;
	public City city;
	public State state;
	public Country country;
	public Location(double no, String street) {
		super();
		this.no = no;
		this.Street = street;
	}
	
	public void setCity(City city) {
		this.city=city;
	}
	public void setState (State state) {
		this.state=state;
	}
	public void setCountry (Country country) {
		this.country=country;
	}
	

}
