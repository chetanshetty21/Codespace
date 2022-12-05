package com.classmate.abstraction.obeys;

import com.classmate.abstraction.rules.BankRule;

public class IndianBank implements BankRule {

	@Override
	public double minBalance() {
		
		return 50;
	}

}
