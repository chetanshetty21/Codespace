package com.dell.constructors.boot;

import com.dell.constructors.things.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boat boat = new Boat("varana");
		System.out.println("name of the boat " + boat.name);
		boat = new Boat("m");
		System.out.println("type of the boat " + boat.type);
		boat = new Boat(7896525f);
		System.out.println("ownerNo of the boat " + boat.ownerNo);
		boat = new Boat(1256);
		System.out.println("ColorNo of the boat " + boat.colorNo);
		boat = new Boat("agani" ,"surya");
		System.out.println("name of the boat and CompanyNmae " + boat.name+boat.companyName);
		boat = new Boat("agani" ,"l");
		System.out.println("name of the boat and CompanyNmae " + boat.name+boat.type);
		boat = new Boat("agani" ,2545f);
		System.out.println("name of the boat and CompanyNmae " + boat.name+boat.ownerNo);
		boat = new Boat("agani" ,4856d);
		System.out.println("name of the boat and CompanyNmae " + boat.name+boat.colorNo);
	}

}
