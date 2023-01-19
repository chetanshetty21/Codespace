package com.xworkz.industry.boot;

import com.xworkz.industry.dto.SoldierDTO;
import com.xworkz.industry.dao.SoldierDAO;
import com.xworkz.industry.dao.SoldierDAOImpl;

import com.xworkz.industry.service.SoldierServiceImpl;

public class soldierRunner {
public static void main(String[] args) {
	SoldierDTO dto = new SoldierDTO("vikramaditya", "airAtacks", 1997, "major", 5);

	SoldierServiceImpl service = new SoldierServiceImpl();
	SoldierDAO ref = new SoldierDAOImpl();
	service.setSoldierRepo(ref);
	service.validateAndSave(dto);
}
}
