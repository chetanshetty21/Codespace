package com.xworkz.industry.dao;

import org.springframework.stereotype.Component;

import com.xworkz.industry.dto.ResortDTO;
@Component
public class ResortDAOImpl implements ResortDAO{

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("data starting to save   ");
		return true;
	}

}
