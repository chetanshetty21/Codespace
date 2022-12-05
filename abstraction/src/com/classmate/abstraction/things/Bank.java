package com.classmate.abstraction.things;

import com.classmate.abstraction.rules.BankRule;

public class Bank {
	private BankRule bankRule;

	public Bank(BankRule bankRule) {
		this.bankRule = bankRule;
		System.out.println("this is param const of indianbank");
	}

	public Bank() {
		System.out.println("this is a default cont");

	}

	public void checkBank() {
		System.out.println("checking bank");

		if (this.bankRule != null) {

			double bank = this.bankRule.minBalance();
			if (bank >=50) {
				System.out.println("account is normal");

			}

			
			}else {
				System.out.println("ngt");

		}
	}
}
