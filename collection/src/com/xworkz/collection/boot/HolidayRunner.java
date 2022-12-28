package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.DTO.AirportDTO;
import com.xworkz.collection.DTO.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {
		HolidayDTO dto1=new HolidayDTO("Summer tYpe", 50, 5d);
		HolidayDTO dto2=new HolidayDTO("Summer tYpe", 50, 5d);
		HolidayDTO dto3=new HolidayDTO("Summer tYpe", 50, 5d);
		HolidayDTO dto4=new HolidayDTO("Summer tYpe", 50, 5d);
		HolidayDTO dto5=new HolidayDTO("Summer tYpe", 50, 5d);
		 boolean equals = dto1.equals(dto2);
			System.out.println(dto1.getType().equals(dto2.getType()));
			Collection<HolidayDTO>holiday= new ArrayList<HolidayDTO>();
			holiday.add(dto1);
			holiday.add(dto3);
			holiday.add(dto4);
			holiday.add(dto5);

			boolean contains = holiday.contains(dto3);
			System.out.println("contains" + contains);
	}

}
