package com.xworkz.valentine.service;

import java.util.Collections;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dao.ValentineDAO;
import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;

@Service
public class ValentineServiceImpl implements ValentineService {
	@Autowired
	private ValentineDAO dao;

	public ValentineServiceImpl() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}

	@Override
	public ValentineDTO findById(int id) {
		if (id > 0) {
			ValentineEntity entity = this.dao.findById(id);
			if (entity != null) {
				System.out.println("entity is found in theservice for id" + id);
				ValentineDTO dto = new ValentineDTO();
				dto.setGift(entity.getGift());
				dto.setName(entity.getName());
				dto.setPlaces(entity.getPlaces());
				dto.setValentineName(entity.getValentineName());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return ValentineService.super.findById(id);
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations in dto" + dto);
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist data is good" + dto);
			ValentineEntity entity = new ValentineEntity();
			entity.setGift(dto.getGift());
			entity.setName(dto.getName());
			entity.setPlaces(dto.getPlaces());
			entity.setValentineName(dto.getValentineName());
			this.dao.save(entity);
			return Collections.emptySet();
		}

	}
}