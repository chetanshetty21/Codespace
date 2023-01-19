package com.xworkz.industry.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.industry.dao.ResortDAO;
import com.xworkz.industry.dto.ResortDTO;

@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private ResortDAO resortDAO;
	private Validator validator;

	@Autowired
	public ResortServiceImpl(Validator validator) {
		super();
		this.validator = validator;
	}

	public void setFirstAidRepositery(ResortDAO resortDAO) {
		this.resortDAO = resortDAO;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Data started to validate in Resort");
		Set<ConstraintViolation<ResortDTO>> violence = validator.validate(dto);
		if (!violence.isEmpty()) {
			System.out.println("There is error in code");
			violence.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			boolean saved = resortDAO.save(dto);
			System.out.println("saved" + saved);
			return saved;
		}

	}

}
