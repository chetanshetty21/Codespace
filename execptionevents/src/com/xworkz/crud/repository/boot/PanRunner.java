package com.xworkz.crud.repository.boot;

import com.xworkz.crud.repository.bridge.EmailRepository;
import com.xworkz.crud.repository.bridge.PanNumberRepository;

import com.xworkz.crud.repository.things.PanNoRepositoryImpl;

public class PanRunner {

	public static void main(String[] args) {
		PanNumberRepository pannumberrepository=new PanNoRepositoryImpl();
				
		pannumberrepository.create("ytq1456");
		pannumberrepository.create("ytq1450");
		pannumberrepository.create("ytq1451");
		pannumberrepository.create("ytq1452");
		pannumberrepository.create("ytq1453");
		pannumberrepository.create("ytq1454");
		pannumberrepository.create("ytq1455");
		pannumberrepository.create("ytq1457");
		pannumberrepository.create("ytq1458");
		pannumberrepository.create("ytq1459");
		pannumberrepository.create("ytq1459");
	}

}
