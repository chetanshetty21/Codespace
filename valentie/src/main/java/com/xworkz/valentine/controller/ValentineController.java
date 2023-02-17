package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/")
public class ValentineController {

	@Autowired
	private ValentineService valentinService;

	private List<String> places = Arrays.asList("cubbon park", "btm", "park", "jpnagar");
	private List<String> gift = Arrays.asList("teddy", "icecream", "car", "bike");

	public ValentineController() {
		System.out.println("creating" + this.getClass().getSimpleName());

	}
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running the onSearch");
		ValentineDTO dto= this.valentinService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data Not Found Enter proper Id");
		}
		return "ValentineSearch";
	}

	@GetMapping("/love")
	public String onValentine(Model model) {
		System.out.println("this is onValentine get method");
		model.addAttribute("places", places);
		model.addAttribute("gift", gift);

		return "valentine";
	}

	@PostMapping("/love")
	public String onValentine(Model model, ValentineDTO dto) {
		System.out.println("running on onValentine post method");
		Set<ConstraintViolation<ValentineDTO>> violations = valentinService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no volations in contoller go to success page");
			model.addAttribute("places", places);
			model.addAttribute("gift", gift);
			return "ValentineSuccess";

		}
		model.addAttribute("places", places);
		model.addAttribute("gift", gift);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);

		System.err.println("volation in controller");
		return "valentine";

	}
}
