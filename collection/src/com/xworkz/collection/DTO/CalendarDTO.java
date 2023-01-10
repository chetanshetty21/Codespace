package com.xworkz.collection.DTO;

import java.io.Serializable;

public class CalendarDTO implements Serializable {
	protected String companyName;
	protected int price;
	protected char size;

	public CalendarDTO() {
		// TODO Auto-generated constructor stub
	}

	public CalendarDTO(String companyName, int price, char size) {
		super();
		this.companyName = companyName;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "CalendarDTO [companyName=" + companyName + ", price=" + price + ", size=" + size + "]";
	}

	@Override
	public boolean equals(Object calendar) {
		System.out.println("starting equals method");
		if (calendar != null) {
			if (calendar instanceof CalendarDTO) {
				CalendarDTO dto = (CalendarDTO) calendar;
				if (dto.companyName.equals(this.companyName)) {
					System.out.println("company name is matching");
					return true;

				}
			}

		}
		return false;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
}
