package com.classmate.abstraction.boot;

import com.classmate.abstraction.obeys.Employe;
import com.classmate.abstraction.rules.Airport;
import com.classmate.abstraction.things.AirportStaffs;

public class AirPortStaffRunner {

	public static void main(String[] args) {
		Airport airport=new Employe();
		AirportStaffs airportStaffs=new AirportStaffs(airport);
		airportStaffs.checkStaffs();
		airportStaffs=new AirportStaffs();

	}

}
