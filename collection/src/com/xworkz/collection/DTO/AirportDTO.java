package com.xworkz.collection.DTO;

import java.io.Serializable;

public class AirportDTO implements Serializable {
	protected String airportName;
	protected Double noOfEmpolyee;
	protected String airportLocated;

	public AirportDTO() {

	}

	public AirportDTO(String airportName, Double noOfEmpolyee, String airportLocated) {
		super();
		this.airportName = airportName;
		this.noOfEmpolyee = noOfEmpolyee;
		this.airportLocated = airportLocated;
	}

	@Override
	public String toString() {
		return "AirportDTO [airportName=" + airportName + ", noOfEmpolyee=" + noOfEmpolyee + ", airportLocated="
				+ airportLocated + "]";
	}

	@Override
	public boolean equals(Object airport) {
		System.out.println("starting equals method");
		if (airport != null) {
			if (airport instanceof AirportDTO) {
				AirportDTO dto = (AirportDTO) airport;
				if (dto.airportName.equals(this.airportName)) {
					
					System.out.println("airport name is matching");
					if (dto.noOfEmpolyee.equals(this.noOfEmpolyee)) {
						System.out.println("noOfEmpolyee is matching");
						return true;
					}
				}
				
				if (dto.airportLocated.equals(this.airportLocated)) {
					System.out.println("airportLocated is matching");
					return true;
				}
			}

		}
		return false;

	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public Double getNoOfEmpolyee() {
		return noOfEmpolyee;
	}

	public void setNoOfEmpolyee(Double noOfEmpolyee) {
		this.noOfEmpolyee = noOfEmpolyee;
	}

	public String getAirportLocated() {
		return airportLocated;
	}

	public void setAirportLocated(String airportLocated) {
		this.airportLocated = airportLocated;
	}
}
