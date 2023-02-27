package com.xworkz.saree.service;

import java.util.Collections;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.saree.dao.SareeDAO;
import com.xworkz.saree.dto.SareeDTO;
import com.xworkz.saree.entity.SareeEntity;
import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;

@Service
public class SareeServiceImpl implements SareeService {
	@Autowired
	private SareeDAO dao;

	public SareeServiceImpl() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}

	@Override
	public SareeDTO findById(int id) {
		if (id > 0) {
			SareeEntity entity = this.dao.findById(id);
			if (entity != null) {
				System.out.println("entity is found in theservice for id" + id);
				SareeDTO dto = new SareeDTO();
				dto.setName(entity.getName());
				dto.setMaterial(entity.getMaterial());
				dto.setModeOFpayemnt(entity.getModeOFpayemnt());
				dto.setColor(entity.getColor());
				dto.setSize(entity.getSize());
				return dto;
			}
		}
		return SareeService.super.findById(id);
	}

	@Override
	public Set<ConstraintViolation<SareeDTO>> validateAndSave(SareeDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SareeDTO>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations in dto" + dto);
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist data is good" + dto);
			SareeEntity entity = new SareeEntity();
			entity.setName(dto.getName());
			entity.setMaterial(dto.getMaterial());
			entity.setModeOFpayemnt(dto.getModeOFpayemnt());
			entity.setColor(dto.getColor());
			entity.setSize(dto.getSize());
			this.dao.save(entity);
			return Collections.emptySet();
		}

	}
}