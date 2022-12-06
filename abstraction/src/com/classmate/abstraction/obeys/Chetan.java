package com.classmate.abstraction.obeys;

import com.classmate.abstraction.rules.KarnatakaRTO;

public class Chetan extends JavaTrainee implements KarnatakaRTO {

	public Chetan(String name, int age, double pHNo, String gender, double height) {
		super(name, age, pHNo, gender, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean paidTax(double tax) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double gst() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double vat() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
