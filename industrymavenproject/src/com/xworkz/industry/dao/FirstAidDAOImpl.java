package com.xworkz.industry.dao;

import org.springframework.stereotype.Component;

import com.xworkz.industry.dto.FirstAidDTO;
@Component
public class FirstAidDAOImpl implements FirstAidDAO {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("data starting to save   ");
		return true;
	}

}
