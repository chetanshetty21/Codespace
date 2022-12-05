package com.classmate.abstraction.things;

import com.classmate.abstraction.rules.HospitalRules;

public class Hospital {
	private HospitalRules hospitalRules;

	public Hospital(HospitalRules hospitalRules) {

		this.hospitalRules = hospitalRules;

		System.out.println("parameterized const");
	}

	public Hospital() {
		System.out.println("defult const");
	}

	public void checkHospital() {
		System.out.println("checking for null pointing");
		if (this.hospitalRules != null) {
			int hospitalRules = this.hospitalRules.visitingHours();
			if (hospitalRules >= 2) {
				System.out.print("only two hr");

			}
		} else {
			System.out.println("it is not two hr");
		}
	}
}
