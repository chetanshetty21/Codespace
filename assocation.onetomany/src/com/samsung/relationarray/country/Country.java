package com.samsung.relationarray.country;

import com.samsung.relationarray.contants.Gender;

public class Country {
	public String name;
	public City[] cities;
	public President president;
	public Gender gender;

	public Country(String name) {
		super();
		this.name = name;

	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	public void setPresident(President president) {
		this.president = president;

	}

	public void setGender(Gender gender) {
		this.gender = gender;

	}

	public void display() {
		System.out.println(this.name);
		if (cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];
				System.out.println(city);
				city.showOff();

			}
		} else {

			System.out.println("city is null");
		}
	}
}
