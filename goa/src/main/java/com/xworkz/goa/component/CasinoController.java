package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/casino")
public class CasinoController {
public CasinoController() {
	System.out.println("creating" + this.getClass().getSimpleName());
}

@GetMapping
public String party(CasinoDTO dto  ,Model model ) {
	System.out.println("CasinoDTO="+dto);
	model.addAttribute("Name" , dto.getName());
	model.addAttribute("Cruise" , dto.getCruise());
	model.addAttribute("Rupees" , dto.getEntryFee());
	model.addAttribute("Freefood" , dto.getFreefood());
	model.addAttribute("FreeAlcohol" , dto.getFreeAlcohol());
	return"SucessCasino.jsp";
}
}
