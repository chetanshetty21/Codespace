package com.xworkz.ipl.boot;

import java.time.LocalDateTime;



import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.repository.WarRepository;
import com.xworkz.ipl.repository.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {
		WarRepository warRepository = new WarRepositoryImpl();

		WarDTO dto1 = new WarDTO("Indo Pak War", LocalDateTime.of(1947, 10, 22, 0, 0),
				LocalDateTime.of(1949, 1, 5, 0, 0), "Pakistan", "India", "India", 2000);
		WarDTO dto2 = new WarDTO("Kargil War", LocalDateTime.of(1999, 5, 22, 0, 0), LocalDateTime.of(1999, 7,22, 0, 0),
				"Pakistan", "India", "India", 527);
		warRepository.create(dto1);
		System.out.println(System.lineSeparator());
		warRepository.create(dto2);
		warRepository.findByStartedBy("india");
		warRepository.findByStartedDateGreaterThanOrEqual(LocalDateTime.of(2000, 5, 22, 0, 0));
		warRepository.findByStartedDateAndEndDate(LocalDateTime.of(1999, 5, 22, 0, 0), LocalDateTime.of(1999, 7,22, 0, 0));
		
	//	warRepository.findByStartedDateLesserThanOrEqual(LocalDateTime.of(1998, 5, 22, 0, 0))
		warRepository.findByStartedWith("Pakistan", "India");
		warRepository.total();
	}

}
