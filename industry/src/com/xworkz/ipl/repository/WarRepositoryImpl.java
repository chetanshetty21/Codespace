package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.exeption.WarSizeExceededException;

public class WarRepositoryImpl implements WarRepository {

	private WarDTO[] warDTOs = new WarDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean create(WarDTO dto) {
		System.out.println("running create of wardto" + dto);
		if (this.currentIndex >= this.warDTOs.length) {
			System.out.println("size exceed cannot add more");
			throw new WarSizeExceededException();
		}

		this.warDTOs[this.currentIndex] = dto;
		System.out.println("saved" + dto + "in index" + currentIndex);
		return false;
	}

	@Override
	public boolean create(WarDTO[] dtos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WarDTO findByStartedWith(String countryStartedWith, String countryStartedBy) {
		for (WarDTO dto : warDTOs) {
			if (dto != null && dto.getCountryStartedWith().equalsIgnoreCase(countryStartedWith)
					&& dto.getCountryStartedBy().equalsIgnoreCase(countryStartedBy)) {
			}
		}
		return null;
	}

	@Override
	public WarDTO findByStartedDateGreaterThanOrEqual(LocalDateTime date) {
		for (WarDTO dto : warDTOs) {
			if (dto != null && dto.getStartDate() != null && dto.getCreatedDate().isAfter(date)) {
				System.out.println("dto is found" + date);
			}

		}

		System.out.println("dto is not found");
		return null;
	}

	@Override
	public WarDTO findByStartedDateLesserThanOrEqual(LocalDateTime date) {
		for (WarDTO dto : warDTOs) {
			if (dto != null && dto.getCreatedDate().isAfter(date)) {
				System.out.println("dto is found" + date);
			}

		}

		System.out.println("dto is not found");
		return null;
	}

	@Override
	public WarDTO findByStartedDateAndEndDate(LocalDateTime start, LocalDateTime end) {
		for (WarDTO dto : warDTOs) {
			if (dto != null && dto.getStartDate().isAfter(start) && dto.getEndDate().isBefore(end)) {
				System.out.println("dto is found" + end);
			}
		}

		return null;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return WarRepository.super.total();
	}

	@Override
	public WarDTO findByStartedBy(String countryStartedBy) {
		// TODO Auto-generated method stub
		return WarRepository.super.findByStartedBy(countryStartedBy);
	}

}
