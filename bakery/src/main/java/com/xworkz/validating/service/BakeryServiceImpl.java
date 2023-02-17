package com.xworkz.validating.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.validating.dao.BakeryDAO;
import com.xworkz.validating.dto.BakeryDTO;

@Service
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	private BakeryDAO bakerydao;

	public BakeryServiceImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("running the validateAndSave");
		boolean save = this.bakerydao.save(dto);
		System.out.println("saved " + save);
		return false;
	}

}
