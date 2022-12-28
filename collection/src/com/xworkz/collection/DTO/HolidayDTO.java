package com.xworkz.collection.DTO;

import java.io.Serializable;

public class HolidayDTO implements Serializable{
	protected String type;
	protected int noOfHolidayInYear;
	protected Double noOFDays;
	public HolidayDTO() {
		// TODO Auto-generated constructor stub
	}

	public HolidayDTO(String type, int noOfHolidayInYear, Double noOFDays) {
		super();
		this.type = type;
		this.noOfHolidayInYear = noOfHolidayInYear;
		this.noOFDays = noOFDays;
	}

	@Override
	public String toString() {
		return "HolidayDTO [type=" + type + ", noOfHolidayInYear=" + noOfHolidayInYear + ", noOFDays=" + noOFDays + "]";
	}
	@Override
	public boolean equals(Object holiday) {
		System.out.println("starting equals method");
		if (holiday != null) {
			if (holiday instanceof HolidayDTO) {
				HolidayDTO dto = (HolidayDTO) holiday;
				if (dto.type.equals(this.type)) {
					System.out.println("holiday type matching");
					return true;

				}
			}

		}
		return false;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfHolidayInYear() {
		return noOfHolidayInYear;
	}

	public void setNoOfHolidayInYear(int noOfHolidayInYear) {
		this.noOfHolidayInYear = noOfHolidayInYear;
	}

	public Double getNoOFDays() {
		return noOFDays;
	}

	public void setNoOFDays(Double noOFDays) {
		this.noOFDays = noOFDays;
	}

}
