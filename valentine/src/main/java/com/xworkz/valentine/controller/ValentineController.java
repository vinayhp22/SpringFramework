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
import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {
	
	@Autowired
	private ValentineService valentineService;
	
	List<String> places = Arrays.asList("Cubbon Park", "Nandi Hills", "Mandagiri Hills", "Lalbagh");

	List<String> gifts = Arrays.asList("Teddy", "Chocolate", "Flower", "Gadgets");
	
	public ValentineController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onValentine(Model model) {
		System.out.println("Running onValentine get method");

		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);

		return "Valentine";
	}
	
	@PostMapping
	public String onValentine(Model model, ValentineDTO dto) {
		System.out.println("Running onValentine post method"+dto);
		
		Set<ConstraintViolation<ValentineDTO>> constraintViolations = this.valentineService.validateAndSave(dto);
		if (constraintViolations.isEmpty()) {
			System.out.println("no violations, going save the details");
			return "ValentineSuccess";
		}
		
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("errors", constraintViolations);
		System.err.println("Violations in dto : "+dto);
		
		return "Valentine";
	}
}
