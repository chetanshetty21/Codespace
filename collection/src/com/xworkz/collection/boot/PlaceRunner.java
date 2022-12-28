package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import com.xworkz.collection.DTO.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO dto1=new PlaceDTO("lalbagh", "garden", "500");
		PlaceDTO dto2=new PlaceDTO("lalbagh", "garden", "500");
		PlaceDTO dto3=new PlaceDTO("lalbagh", "garden", "500");
		PlaceDTO dto4=new PlaceDTO("lalbagh", "garden", "500");
		PlaceDTO dto5=new PlaceDTO("lalbagh", "garden", "500");
		boolean equals = dto1.equals(dto2);
		System.out.println(dto1.getPlaceName().equals(dto2.getPlaceName()));
		Collection<PlaceDTO> place = new ArrayList<PlaceDTO>();
		place.add(dto1);
		place.add(dto3);
		place.add(dto4);
		place.add(dto5);

		boolean contains = place.contains(dto3);
		System.out.println("contains" + contains);

		
	}

}
