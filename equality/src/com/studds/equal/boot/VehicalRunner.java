package com.studds.equal.boot;

import com.studds.equal.things.Vehical;

public class VehicalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehical vehical=new Vehical("hero", "radeon", 5485d, "blue", 5, true, "fsgrw564", "aug2022", "sept2035",
		586522325d);
System.out.println(vehical);
	
	Vehical vehical1=new Vehical("hero", "radeon", 5485d, "blue", 5, true, "fsgrw564", "aug2022", "sept2035",
			586522325d);
	System.out.println(vehical1);
	boolean same =vehical.equals(vehical1);
	System.out.println(same);
	}
}
