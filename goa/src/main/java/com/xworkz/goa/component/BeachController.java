package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;
@Component
@RequestMapping("/beach")
public class BeachController {
	public BeachController() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}

	@GetMapping
	public String party(BeachDTO dto  ,Model model ) {
		System.out.println("BeachDTO="+dto);
		model.addAttribute("Name" , dto.getName());
		model.addAttribute("Location" , dto.getLocation());
    	model.addAttribute("Clean" , dto.getClean());
		model.addAttribute("Games" , dto.getGames());
		return"SucessBeach.jsp";
}
}