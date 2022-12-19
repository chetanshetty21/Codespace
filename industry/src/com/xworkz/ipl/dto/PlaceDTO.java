package com.xworkz.ipl.dto;

import com.xworkz.ipl.dto.AbstractAudiDTO;

public class PlaceDTO extends AbstractAudiDTO {
	private String placeName;
	private String placeType;
	private double entryPrice;
	private double openTime;
	private double closeTime;

	public PlaceDTO() {

	}

	@Override
	public String toString() {
		return "PlaceDTO [placeName=" + placeName + ", placeType=" + placeType + ", entryPrice=" + entryPrice
				+ ", openTime=" + openTime + ", closeTime=" + closeTime + ", toString()=" + super.toString() + "]";
	}

	public PlaceDTO(String placeName, String placeType, double entryPrice, double openTime, double closeTime) {
		super();
		this.placeName = placeName;
		this.placeType = placeType;
		this.entryPrice = entryPrice;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public double getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(double entryPrice) {
		this.entryPrice = entryPrice;
	}

	public double getOpenTime() {
		return openTime;
	}

	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public double getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}
}
