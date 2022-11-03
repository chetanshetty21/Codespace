package com.xworkz.access.boot;

import com.xworkz.access.things.Bike;
import com.xworkz.access.things.BikeShowRoom;

public class BikeShowRoomRunner {

	public static void main(String[] args) {

		BikeShowRoom store = new BikeShowRoom();
		Bike bike = new Bike();

		store.useBike(bike);
		System.out.println(store.shopName);
		System.out.println(bike.brand);
		System.out.println(bike.color);
		System.out.println(bike.mgf);
		System.out.println(bike.price);
		System.out.println(bike.size);
		System.out.println(bike.getNoOFKeys());
		// guitar.setNoOFKeys(5); because it is in default and u can not access the set
		// method
		System.out.println(bike.getNoOfWheels());

		System.out.println(bike.getType());
		System.out.println(bike.getWarranty());
	}

}
