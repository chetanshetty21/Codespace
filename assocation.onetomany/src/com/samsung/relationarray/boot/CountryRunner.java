package com.samsung.relationarray.boot;

import com.samsung.relationarray.contants.Gender;
import com.samsung.relationarray.country.City;
import com.samsung.relationarray.country.Country;
import com.samsung.relationarray.country.Name;
import com.samsung.relationarray.country.President;

public class CountryRunner {

	public static void main(String[] args) {
		Country country = new Country("India");
		President president = new President("narendra modi");
		president.setGender(Gender.MALE);
		president.setTotalVotes(651266446L);
		country.setPresident(president);


		Name name1 = new Name("jambu dweepa", "india", "dont know");
		City city = new City(name1);
		city.setAreaInSqKm(362);
		city.setCapital(true);

		Name name2 = new Name("bharat", "india", "dont know");
		City city2 = new City(name2);
		city2.setAreaInSqKm(653);
		city2.setCapital(false);

		City[] cities = { city, city2 };
		country.setCities(cities);

		country.display();
	}
}