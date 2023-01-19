package com.xworkz.industry.dao;

import org.springframework.stereotype.Component;

import com.xworkz.industry.dto.MissileDTO;
@Component
public class MissileDAOImpl implements MissileDAO{

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("data starting to save   ");
		return true;
	}

}
