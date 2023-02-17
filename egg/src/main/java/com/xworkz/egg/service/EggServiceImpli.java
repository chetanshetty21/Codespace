package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.DTO.EggDTO;
import com.xworkz.egg.repository.EggRepo;

@Service
public class EggServiceImpli implements EggService {
	
	@Autowired
	private EggRepo eggRepo;

	public EggServiceImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("validateAndSave");
		boolean saved=this.eggRepo.save(dto);
		System.out.println("saved in service:"+saved);
		return false;
	}

}
