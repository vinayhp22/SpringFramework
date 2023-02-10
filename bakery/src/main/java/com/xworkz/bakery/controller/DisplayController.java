package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping
public class DisplayController {
	@Autowired
	BakeryService bakeryService;

	public DisplayController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/bakerySuccess")
	public String onBakery(BakeryDTO dto, Model model) {
		System.out.println("Running  onBakery(BakeryDTO dto, Model model) " + dto);
		model.addAttribute("bakeryName", dto.getBakeryName());
		model.addAttribute("bakeryOwnerName", dto.getBakeryOwnerName());
		model.addAttribute("bakeryOwnerWifeName", dto.getBakeryOwnerWifeName());
		model.addAttribute("bakeryOwnerOwnerMarried", dto.getBakeryOwnerOwnerMarried());
		model.addAttribute("bakeryFamousFor", dto.getBakeryFamousFor());
		model.addAttribute("bakerySince", dto.getBakerySince());
		boolean valid = bakeryService.validateAndSave(dto);
		System.out.println("show :" + valid);
		return "BakerySuccess.jsp";
	}

}
