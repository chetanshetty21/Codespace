package com.xworkz.collection.DTO;

import java.io.Serializable;

public class PlaceDTO implements Serializable {

	protected String placeName;
	protected String type;
	protected String entryFee;

	public PlaceDTO() {

	}

	public PlaceDTO(String placeName, String type, String entryFee) {
		super();
		this.placeName = placeName;
		this.type = type;
		this.entryFee = entryFee;
	}

	@Override
	public String toString() {
		return "PlaceDTO [placeName=" + placeName + ", type=" + type + ", entryFee=" + entryFee + "]";
	}

	@Override
	public boolean equals(Object place) {
		System.out.println("starting equals method");
		if (place != null) {
			if (place instanceof PlaceDTO) {
				PlaceDTO dto = (PlaceDTO) place;
				if (dto.placeName.equals(this.placeName)) {
					System.out.println("place name is matching");
					return true;
				
				}
				}

		}
		return false;
	}
	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(String entryFee) {
		this.entryFee = entryFee;
	}

}
