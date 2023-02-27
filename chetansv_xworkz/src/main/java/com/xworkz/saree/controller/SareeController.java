package com.xworkz.saree.controller;

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

import com.xworkz.saree.dto.SareeDTO;
import com.xworkz.saree.service.SareeService;

@Controller
@RequestMapping("/")
public class SareeController {
	@Autowired
	private SareeService sareeService;
	private List<String> size = Arrays.asList("small", "medium", "large");
	private List<String> color = Arrays.asList("red", "green", "blue", "grey");

	public SareeController() {
		System.out.println("creating" + this.getClass().getSimpleName());

	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running the onSearch");
		SareeDTO dto = this.sareeService.findById(id);
		System.out.println("dto:"+dto);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data Not Found Enter proper Id");
		}
		return "SareeSearch";
	}

	@GetMapping("/style")
	public String onSaree(Model model) {
		System.out.println("this is onsaree get method");
		model.addAttribute("size", size);
		model.addAttribute("color", color);

		return "Saree";
	}

	@PostMapping("/style")
	public String onSaree(Model model, SareeDTO dto) {
		System.out.println("running on onValentine post method");
		Set<ConstraintViolation<SareeDTO>> violations = sareeService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no volations in contoller go to success page");
			model.addAttribute("size", size);
			model.addAttribute("color", color);
			return "sareeSucess";

		}
		model.addAttribute("size", size);
		model.addAttribute("color", color);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);

		System.err.println("volation in controller");
		return "Saree";

	}
}
