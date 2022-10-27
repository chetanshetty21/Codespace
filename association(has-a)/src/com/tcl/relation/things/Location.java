package com.tcl.relation.things;

public class Location {
	
		public String street;
		public String city;
		public String state;
		public long pincode;
		public String country;

		public Location(String street, String city, String state, long pincode, String country) {
			super();
			this.street = street;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.country = country;
		}

		public void show() {
			System.out.println("Distict " +street);
			System.out.println("city "+ city);
			System.out.println("state "+ state);
			System.out.println("pincode "+ pincode);
			System.out.println("Country "+ country);
		}

	}

