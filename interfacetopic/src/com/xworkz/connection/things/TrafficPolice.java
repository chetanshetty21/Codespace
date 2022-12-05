package com.xworkz.connection.things;

import com.xworkz.connection.bridge.*;

public class TrafficPolice implements TrafficRules {

	@Override
	public int fine1(int value1) {
		System.out.println("value =="+value1);
		return value1;
	}

	@Override
	public double fine2(double value2) {
		System.out.println("value =="+value2);
		return value2;
	}

	@Override
	public float fine3(float value3) {
		System.out.println("value =="+value3);
		return value3;
	}

	@Override
	public String fineName1(String name1) {
		System.out.println("name =="+name1);
		return name1;
	}

	@Override
	public String fineName2(String name2) {
		System.out.println("name =="+name2);
		return name2;
	}

}
