package com.xworkz.egg.repository;

import com.xworkz.egg.DTO.EggDTO;

public interface EggRepo {
	boolean save(EggDTO dto);
}