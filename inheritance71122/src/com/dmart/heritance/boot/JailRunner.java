package com.dmart.heritance.boot;

import com.dmart.heritance.childclass.*;
import com.dmart.heritance.things.Jail;

public class JailRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jail jail = new Jail();
		System.out.println(jail.location);
		System.out.println(jail.name);
		System.out.println(System.lineSeparator());

		CenterJail centralJail = (CenterJail) jail;
		System.out.println(centralJail.jailerName);
		System.out.println(centralJail.adress);
		System.out.println(System.lineSeparator());

		Jail jail2 = new CityJail();
		System.out.println(jail2.location);
		System.out.println(jail2.name);
		CityJail jail3 = (CityJail) jail2;
		System.out.println(jail3.jailCode);
		System.out.println(jail3.robberName);
		System.out.println(System.lineSeparator());

		Jail jail4 = new Jail();
		System.out.println(jail4.location);
		System.out.println(jail4.name);
		Subjail jail5 = (Subjail) jail4;
		System.out.println(jail5.totalSubJails);
		System.out.println(jail5.location);
	}

}
