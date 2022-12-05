package com.classmate.abstraction.boot;

import com.classmate.abstraction.obeys.IndianBank;
import com.classmate.abstraction.rules.BankRule;
import com.classmate.abstraction.things.Bank;

public class BankRunner {

	public static void main(String[] args) {

		BankRule bankRule = new IndianBank();
		Bank bank = new Bank(bankRule);
		bank.checkBank();
		bank = new Bank();
	}
}
