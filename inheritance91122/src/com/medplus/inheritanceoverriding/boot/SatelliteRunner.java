package com.medplus.inheritanceoverriding.boot;

import com.medplus.inheritanceoverriding.childclass.Moon;
import com.medplus.inheritanceoverriding.things.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		Satellite satellite = new Moon("moon", "milkiway", 28);
		satellite.revolve();
		Moon moon = new Moon("pluto", "universe", 360);
		moon.revolve();
	}
	// TODO Auto-generated method stub

}
