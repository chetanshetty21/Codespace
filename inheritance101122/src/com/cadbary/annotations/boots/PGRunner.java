package com.cadbary.annotations.boots;

import com.cadbary.annotations.childclass.Home;
import com.cadbary.annotations.things.PG;

public class PGRunner {

	public static void main(String[] args) {

		PG pg = new Home();
		pg.details();
		pg.name();

	}

}
