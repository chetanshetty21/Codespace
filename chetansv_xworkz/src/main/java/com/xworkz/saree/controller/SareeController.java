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
import com.xworkz.saree.entity.SareeEntity;
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
		System.out.println("dto:" + dto);
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

	@GetMapping("/searchbyname")
	public String onSearchByName(@RequestParam String name, Model model) {
		System.out.println("running onsearchByName controller" + name);
		List<SareeDTO> list = this.sareeService.findByName(name);
		model.addAttribute("list", list);
		return "NameSearch";
	}

	@GetMapping("/Update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("running update get method");
		System.out.println("running onUpdate " + id);
		SareeDTO dto = this.sareeService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("size", size);
		model.addAttribute("color", color);
		return "Update";
	}

	@PostMapping("/Update")
	public String onUpdate(SareeDTO dto, Model model) {
		System.out.println("running onUpdate " + dto);

		Set<ConstraintViolation<SareeDTO>> constraintViolations = this.sareeService.validateAndUpdate(dto);
		if (constraintViolations.size() > 0) {
			model.addAttribute("error", constraintViolations);
		} else {
			model.addAttribute("message", "update success");
		}
		return "Update";
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("running onDelete");
		SareeDTO sareeDto = this.sareeService.deleteById(id);
		model.addAttribute("delete", sareeDto);
		model.addAttribute("message", "deleted successfully");
		return "Delete";

	}

	@GetMapping("/searchbyall")
	public String onSearchByAll(Model model) {
		System.out.println("running onsearchByAll controller");
		List<SareeDTO> list = this.sareeService.findByAll();

		if (list != null) {

			model.addAttribute("list", list);
		} else {
			model.addAttribute("message", "found successfully");
		}
		return "SearchAll";
	}

	@PostMapping("/searchtwoproperties")
	public String onSearchTwoProperties(@RequestParam String name, @RequestParam String color, Model model) {
		System.out.println("running onsearchByName controller" + "property1" + name + "property2" + color);
		List<SareeDTO> list = this.sareeService.findByTwoProperties(name, color);

		if (list != null) {

			model.addAttribute("list", list);
		} else {
			model.addAttribute("message", "found successfully");
		}
		return "SearchTwoProperties";
	}

}
