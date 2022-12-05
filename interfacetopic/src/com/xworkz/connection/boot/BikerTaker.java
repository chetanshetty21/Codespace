package com.xworkz.connection.boot;

import com.xworkz.connection.bridge.BikeDetails;

public class BikerTaker {

	public static void main(String[] args) {
		BikeDetails bikedetails = new BikeDetails();
		bikedetails.color("blue");
		bikedetails.goundClearnce(125);
		bikedetails.mileage(149f);
		bikedetails.price(101000.50d);
		bikedetails.type("gear bike");
	}

}