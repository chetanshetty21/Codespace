package com.classmate.abstraction.boot;

import com.classmate.abstraction.obeys.Visitors;
import com.classmate.abstraction.rules.HospitalRules;
import com.classmate.abstraction.things.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		HospitalRules hospitalRules=new Visitors();
		Hospital hospital=new Hospital(hospitalRules);
		 hospital=new Hospital();
		 hospital.checkHospital();
	}

}
