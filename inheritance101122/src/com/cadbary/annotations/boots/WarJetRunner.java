package com.cadbary.annotations.boots;

import com.cadbary.annotations.childclass.Rafell;
import com.cadbary.annotations.things.WarJet;

public class WarJetRunner {

	public static void main(String[] args) {
		WarJet warjet = new Rafell();
		warjet.getready();
		warjet.nameOfTheJet();
	}

}