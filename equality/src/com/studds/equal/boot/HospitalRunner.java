package com.studds.equal.boot;

import com.studds.equal.things.Hospital;

public class HospitalRunner {
	public static void main(String[] args) {

		Hospital hospital = new Hospital("shaker", "eye-hospital", 800, 80, 'm', "ramesh", "hyderabad", 85652365L,
				false, 28);
		System.out.println(hospital);

		Hospital hospital2 = new Hospital("shaker", "eye-hospital", 800, 80, 'm', "ramesh", "hyderabad", 85652365L,
				false, 28);
		System.out.println(hospital2);

		boolean same = hospital.equals(hospital2);
		System.out.println(same);
	}

}
