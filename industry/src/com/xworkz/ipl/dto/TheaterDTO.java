package com.xworkz.ipl.dto;

public class TheaterDTO extends AbstractAudiDTO{
	private String id;
	private String name;
	private String brand;
	private double seats;
	public TheaterDTO() {
		// TODO Auto-generated constructor stub
	}
	public TheaterDTO(String id, String name, String brand, double seats) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "TheaterDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getSeats() {
		return seats;
	}
	public void setSeats(double seats) {
		this.seats = seats;
	}
	

}
