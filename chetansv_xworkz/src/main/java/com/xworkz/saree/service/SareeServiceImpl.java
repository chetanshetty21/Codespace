package com.xworkz.saree.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.saree.configuration.WebConfiguration;
import com.xworkz.saree.dao.SareeDAO;
import com.xworkz.saree.dto.SareeDTO;
import com.xworkz.saree.entity.SareeEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SareeServiceImpl implements SareeService {
	@Autowired
	private SareeDAO dao;

	public SareeServiceImpl() {
		log.info("creating" + this.getClass().getSimpleName());
	}

	@Override
	public SareeDTO findById(int id) {
		if (id > 0) {
			SareeEntity entity = this.dao.findById(id);
			if (entity != null) {
				log.info("entity is found in theservice for id" + id);
				SareeDTO dto = new SareeDTO();
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}
		}
		return SareeService.super.findById(id);
	}

	@Override
	public Set<ConstraintViolation<SareeDTO>> validateAndSave(SareeDTO dto) {
		Set<ConstraintViolation<SareeDTO>> constraintViolations = validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			log.info("constraintViolations in dto" + dto);
			return constraintViolations;
		} else {
			log.info("constraintViolations does not exist data is good" + dto);
			SareeEntity entity = new SareeEntity();
			BeanUtils.copyProperties(dto, entity);
			this.dao.save(entity);
			return Collections.emptySet();
		}

	}

	@Override
	public List<SareeDTO> findByName(String name) {
		System.out.println("running findByCompany in service " + name);
		if (name != null && !name.isEmpty()) {
			System.out.println("name is valid ....calling repo");
			List<SareeEntity> entities = this.dao.findByName(name);
			List<SareeDTO> dtos = new ArrayList<SareeDTO>();
			for (SareeEntity entity : entities) {
				SareeDTO dto = new SareeDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			log.info("size of dtos" + dtos.size());
			log.info("size of entites" + entities.size());
			return dtos;
		}
		return SareeService.super.findByName(name);
	}

	@Override
	public Set<ConstraintViolation<SareeDTO>> validateAndUpdate(SareeDTO sareeDTO) {
		Set<ConstraintViolation<SareeDTO>> violations = validate(sareeDTO);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations " + sareeDTO);
			return violations;
		} else {

			log.info("no violations can save the data");
			SareeEntity entity = new SareeEntity();
			BeanUtils.copyProperties(sareeDTO, entity);
			boolean saved = this.dao.update(entity);
			System.out.println("saved " + saved);
			return Collections.emptySet();

		}
	}

	private Set<ConstraintViolation<SareeDTO>> validate(SareeDTO sareeDTO) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SareeDTO>> violations = validator.validate(sareeDTO);
		return violations;
	}

	@Override
	public SareeDTO deleteById(int id) {
		log.info("running onDelete");
		SareeEntity entity = this.dao.deleteById(id);

		if (entity != null) {
			SareeDTO dto = new SareeDTO();
			BeanUtils.copyProperties(dto, entity);
			return dto;
		} else {
			return SareeService.super.deleteById(id);
		}
	}

	@Override
	public List<SareeDTO> findByAll() {
		log.info("running findByAll in service ");
		log.info("Data is valid ....calling repo");
		List<SareeEntity> entities = this.dao.findByAll();
		List<SareeDTO> dtos = new ArrayList<SareeDTO>();
		for (SareeEntity entity : entities) {
			SareeDTO dto = new SareeDTO();
			BeanUtils.copyProperties(entity, dto);
			dtos.add(dto);
		}
		log.info("size of dtos" + dtos.size());
		log.info("size of entites" + entities.size());
		return dtos;

	}

	@Override
	public List<SareeDTO> findByTwoProperties(String name, String color) {
		log.info("running findByTwoProperties in service " + "property1" + name + "property2" + color);
		if (name != null && !name.isEmpty() || color != null && !color.isEmpty()) {
			log.info("Data is valid ....calling repo");
			List<SareeEntity> entities = this.dao.findByTwoProperties(name, color);
			List<SareeDTO> dtos = new ArrayList<SareeDTO>();
			for (SareeEntity entity : entities) {
				SareeDTO dto = new SareeDTO();
				BeanUtils.copyProperties(entity, dto);
				//dto.setName(entity.getName()); getu  first in bean utils 
				dtos.add(dto);
			}
			log.info("size of dtos" + dtos.size());
			log.info("size of entites" + entities.size());
			return dtos;
		}
		return SareeService.super.findByTwoProperties(name, color);
	}

}
