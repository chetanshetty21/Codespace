package com.xworkz.crud.repository.boot;

import com.xworkz.crud.repository.bridge.SweetsNameRepository;
import com.xworkz.crud.repository.things.SweetsRepositoryImpl;

public class SweetsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SweetsNameRepository sweetsnameRepository=new SweetsRepositoryImpl() ;

sweetsnameRepository.create("Gulab Jamun");
sweetsnameRepository.create("Jalebi");
sweetsnameRepository.create("Kheer");
sweetsnameRepository.create("Shrikhand");
sweetsnameRepository.create("Patishapta");
sweetsnameRepository.create("Gajar Ka Halwa");
sweetsnameRepository.create("Rasmalai");
sweetsnameRepository.create("Ghevar");
sweetsnameRepository.create("Kaju Katli");
sweetsnameRepository.create("Barfi ");
	}

}
