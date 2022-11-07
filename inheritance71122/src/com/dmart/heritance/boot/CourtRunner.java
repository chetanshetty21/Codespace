package com.dmart.heritance.boot;

import com.dmart.heritance.childclass.*;
import com.dmart.heritance.things.Court;

public class CourtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Court court = new Court();
		System.out.println(court.Staff);
		System.out.println(court.StateName);
		System.out.println(System.lineSeparator());
		SupremeCourt supremeCourt = (SupremeCourt) court;
		System.out.println(supremeCourt.judgeName);
		System.out.println(supremeCourt.noOfCase);
		System.out.println(System.lineSeparator());
		Court court1 = new HighCourt();
		HighCourt highcourt = (HighCourt) court1;
		System.out.println(highcourt.judgeName);
		System.out.println(highcourt.noOfCase);
		System.out.println(System.lineSeparator());
		DistrictCourt districtcourt = (DistrictCourt) court;
		System.out.println(districtcourt.judgeName);
		System.out.println(districtcourt.noOfCase);
		System.out.println(System.lineSeparator());
	}

}
