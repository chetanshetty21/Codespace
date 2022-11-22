package com.studds.equal.boot;

import com.studds.equal.things.Institution;

public class InstitutionRunner {
	public static void main(String[] args) {
		Institution institution=new Institution("IIM", "management", 85460L, 125, 'i', "bharatkumar", "delhi", 4521365L, false, 10);
		
		System.out.println(institution);

		Institution institution2=new Institution("IIM", "management", 85460L, 125, 'i', "bharatkumar", "delhi", 4521365L, false, 10);
		System.out.println(institution2);
		boolean same=institution.equals(institution2);
		System.out.println(same);
	}
}
