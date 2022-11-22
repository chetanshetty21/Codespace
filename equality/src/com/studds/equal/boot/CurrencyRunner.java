package com.studds.equal.boot;

import com.studds.equal.things.Currency;

public class CurrencyRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Currency currenacy = new Currency("Rupai", 5000, "RBI", "light yellow", true, "Champaklal Choksey", 1997,
				"Mumbai", 79845, true);

		System.out.println(currenacy);

		Currency currenacy2 = new Currency("Rupai", 563400, "RBI", "light yellow", true, "Laxman Raj", 2002, "Mumbai",
				885667, true);
		System.out.println(currenacy2);

		boolean same = currenacy.equals(currenacy2);
		System.out.println(same);

	}

}
