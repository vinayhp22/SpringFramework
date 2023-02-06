package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
public class CasinoController {

	public CasinoController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCasino(CasinoDTO dto, Model model) {
		System.out.println("Running Casino");
		model.addAttribute("name", dto.getName());
		model.addAttribute("cruise", dto.getCruise());
		model.addAttribute("entryFee", dto.getEntryFee());
		model.addAttribute("freeFood", dto.isFreeFood());
		return "CasinoSuccess.jsp";
	}
}
