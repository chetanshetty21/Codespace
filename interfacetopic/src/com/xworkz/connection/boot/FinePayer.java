package com.xworkz.connection.boot;

import com.xworkz.connection.things.TrafficPolice;

public class FinePayer {

	public static void main(String[] args) {

		TrafficPolice trafficpolice = new TrafficPolice();
		trafficpolice.fine1(100);
		trafficpolice.fine2(500d);
		trafficpolice.fine3(100f);
		trafficpolice.fineName1("trippleridding");
		trafficpolice.fineName2("not wearing helmet");
	}

}
