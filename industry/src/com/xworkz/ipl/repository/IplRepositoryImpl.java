package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exeption.IplSizeExceededException;

public class IplRepositoryImpl implements IplRepository {
	private IplDTO[] iplDTOs = new IplDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("running create of ipledto" + dto);
		if (this.currentIndex >= this.iplDTOs.length ) {
			System.out.println("size exceed cannot add more");
			throw new IplSizeExceededException();

		}

		this.iplDTOs[this.currentIndex] = dto;
		System.out.println("saved" + dto + "in index" + currentIndex);
		this.currentIndex++;
		
		return true;

	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return IplRepository.super.total();
	}
	
}
