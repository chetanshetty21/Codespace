package com.dmart.heritance.boot;

import com.dmart.heritance.childclass.*;
import com.dmart.heritance.things.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		System.out.println(doctor.hospitalName);
		System.out.println(doctor.location);
		System.out.println(System.lineSeparator() );
		ENT ent = (ENT) doctor;
		System.out.println(ent.Name);
		System.out.println(ent.Price);
		System.out.println(System.lineSeparator() );
		Doctor doctor1 = new Cardiologist();/// Doctor doctor1 = new Cardiologist(); casting =calling from parent class
											/// ref to child class ref
		Cardiologist cardiologist = (Cardiologist) doctor1;
		System.out.println(cardiologist.Name);
		System.out.println(cardiologist.Price);
		System.out.println(System.lineSeparator() );
		Doctor doctor2 = new Dentist();
		Dentist dentist = (Dentist) doctor2;
		System.out.println(dentist.Name);
		System.out.println(dentist.Price);
	}

}
