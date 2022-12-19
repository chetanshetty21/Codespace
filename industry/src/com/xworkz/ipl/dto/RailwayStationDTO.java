package com.xworkz.ipl.dto;

public class RailwayStationDTO extends AbstractAudiDTO{
	private String name;
	private double noOfPlatforms;
	private String area;
	private  double platformTicketPrice;
	
	public RailwayStationDTO() {
		// TODO Auto-generated constructor stub
	}

	public RailwayStationDTO(String name, double noOfPlatforms, String area, double platformTicketPrice) {
		super();
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(double noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(double platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

}
