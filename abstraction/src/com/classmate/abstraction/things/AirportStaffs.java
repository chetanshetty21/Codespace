package com.classmate.abstraction.things;

import com.classmate.abstraction.rules.Airport;

public class AirportStaffs {

	private Airport airport;

	public AirportStaffs(Airport airport) {
		this.airport = airport;
		System.out.println("it is parameterzied cont");
	}

	public AirportStaffs() {
		System.out.println("it is ha default const");
	}

	public void checkStaffs(){
		System.out.println("checking for null");
		if (this.airport!=null)	{
			float Staffs =this.airport.AirportEmployeTime();
			if(Staffs>0 ) {
				System.out.println("station is crt");
				
			}
		}else {
			System.out.println("station is not correct");
		}
	}
}
