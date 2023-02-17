package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.DTO.EggDTO;
import com.xworkz.egg.service.EggService;

@Controller
@RequestMapping("/fresh")
public class EggController {
	@Autowired
	private EggService eggService;

	public EggController() {
		System.out.println("Created:" + getClass().getSimpleName());
	}

	@PostMapping
	public String onOrder(EggDTO dto, Model model) {
		System.out.println("Running onOrder" + dto);
		boolean saved=this.eggService.validateAndSave(dto);
		System.out.println("saved:"+saved);
		return "index";
	}

}