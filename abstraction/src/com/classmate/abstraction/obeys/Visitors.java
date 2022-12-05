package com.classmate.abstraction.obeys;

import com.classmate.abstraction.rules.HospitalRules;

public class Visitors implements HospitalRules {

	@Override
	public int visitingHours() {
		return 2;
	}

}
