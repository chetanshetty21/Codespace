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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlaceDTO other = (PlaceDTO) obj;
		if (entryFee == null) {
			if (other.entryFee != null)
				return false;
		} else if (!entryFee.equals(other.entryFee))
			return false;
		if (placeName == null) {
			if (other.placeName != null)
				return false;
		} else if (!placeName.equals(other.placeName))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
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
