package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.DTO.CalendarDTO;

public class CalendarRunner {

	public static void main(String[] args) {
		CalendarDTO dto1 = new CalendarDTO("Karanataka calender", 50, 'm');
		CalendarDTO dto2 = new CalendarDTO("Karanataka calender", 50, 'm');
		CalendarDTO dto3 = new CalendarDTO("Karanataka calender", 50, 'm');
		CalendarDTO dto4 = new CalendarDTO("Karanataka calender", 50, 'm');
		CalendarDTO dto5 = new CalendarDTO("Karanataka calender", 50, 'm');

		boolean equals = dto1.equals(dto2);
		System.out.println(dto1.getCompanyName().equals(dto2.getCompanyName()));
		Collection<CalendarDTO> calendar = new ArrayList<CalendarDTO>();
		calendar.add(dto1);
		calendar.add(dto3);
		calendar.add(dto4);
		calendar.add(dto5);

		boolean contains = calendar.contains(dto3);
		System.out.println("contains" + contains);

	}

}
