package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {

	boolean create(WarDTO dto);

	boolean create(WarDTO[] dtos);

	default int total() {
		return 0;
	}

	default WarDTO findByStartedBy(String countryStartedBy) {
		return null;
	}


	WarDTO findByStartedWith(String countryStartedWith, String countryStartedBy);
    WarDTO findByStartedDateGreaterThanOrEqual(LocalDateTime date);
    WarDTO findByStartedDateLesserThanOrEqual(LocalDateTime date);
    WarDTO findByStartedDateAndEndDate(LocalDateTime start, LocalDateTime end);

   
}

