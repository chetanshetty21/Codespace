package com.xworkz.industry.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.industry.dao.MissileDAO;
import com.xworkz.industry.dto.MissileDTO;

@Component
public class MissileServiceImpl implements MissileService{
	private MissileDAO missileDAO;
	private Validator validator;

	public MissileServiceImpl(MissileDAO missileDAO, Validator validator) {
		super();
		this.missileDAO = missileDAO;
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("starts validation of missile");
		System.out.println("dto" + dto);
		Set<ConstraintViolation<MissileDTO>> violance = validator.validate(dto);
		if (!violance.isEmpty()) {
			System.out.println("errer in data");
			violance.forEach(ele -> System.err.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("no violence");
			boolean saved = missileDAO.save(dto);
			System.out.println("saved" + saved);
			return true;

		}

	}

}
