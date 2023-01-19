package com.xworkz.industry.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.industry.dao.FirstAidDAO;
import com.xworkz.industry.dto.FirstAidDTO;
@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private FirstAidDAO firstAidDAO;
	private Validator validator;

	@Autowired
	public FirstAidServiceImpl(Validator validator) {
		super();
		this.validator = validator;
	}

	public void setFirstAidRepositery(FirstAidDAO firstAidRepositery) {
		this.firstAidDAO = firstAidRepositery;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("data started to validate in FirstAid");
		System.out.println("dto---" + dto);
		Set<ConstraintViolation<FirstAidDTO>> violense = validator.validate(dto);
		if (!violense.isEmpty()) {
			System.err.println("there is error");
			violense.forEach(ele -> System.err.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("there is no error ");
			boolean saved = firstAidDAO.save(dto);
			System.out.println("data saved" + saved);
			return saved;
		}
	}
}
