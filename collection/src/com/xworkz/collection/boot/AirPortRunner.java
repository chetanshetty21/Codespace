package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.DTO.AirportDTO;

public class AirPortRunner extends AirportDTO {

	public static void main(String[] args) {

		AirportDTO dto1 = new AirportDTO("Kempegowda International Airport", 500D, "bangalore");
		AirportDTO dto2 = new AirportDTO("Mandakalli Airport ", 500D, "Mysore");
		AirportDTO dto3 = new AirportDTO("MBajpe International Airport ", 500D, "Mangaluru");
		AirportDTO dto4 = new AirportDTO("Hubballi Airport", 500D, "Hubballi");
		AirportDTO dto5 = new AirportDTO("Belagavi Airport ", 500D, "Belagavi");

		boolean equals = dto1.equals(dto2);
		System.out.println(dto1.getAirportName().equals(dto2.getAirportName()));
		Collection<AirportDTO> airport = new ArrayList<AirportDTO>();
		airport.add(dto1);
		airport.add(dto3);
		airport.add(dto4);
		airport.add(dto5);

		boolean contains = airport.contains(dto3);
		System.out.println("contains" + contains);
	}

}
