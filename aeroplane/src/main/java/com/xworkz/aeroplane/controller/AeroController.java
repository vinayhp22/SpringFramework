package com.xworkz.aeroplane.controller;

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
import com.xworkz.aeroplane.dto.AeroDTO;
import com.xworkz.aeroplane.service.AeroService;

@Controller
@RequestMapping
public class AeroController {

	@Autowired
	private AeroService aeroService;
	
	private List<String> type = Arrays.asList("Light Combat Aircraft(LCA)","Light Utility Helicopter(LUH)", "Light Combat Helicopter(LCH)", "Advanced Light Helicopter(ALH)");
	
	private List<String> country = Arrays.asList("India", "USA", "Australia", "UK", "Germany", "Russia", "Japan", "Egypt","Rome","Israel");
			
	public AeroController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/aeroplane")
	public String onAero(Model model) {
		System.out.println("Running onAero getmapping");
		
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		
		return "Aeroplane";
	}
	
	@PostMapping("/aeroplane")
	public String onAero(AeroDTO dto, Model model) {
		System.out.println("Running onAero postmapping");
		
		Set<ConstraintViolation<AeroDTO>> violations = this.aeroService.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("No violations in dto, going to save in database" + dto);
			model.addAttribute("dto",dto);
			return "AeroplaneSuccess";
		}
		System.err.println("Violations in onAero, the dto  : "+dto);
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		model.addAttribute("dto",dto);
		model.addAttribute("errors",violations);
		return "Aeroplane";
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id"+id);
		AeroDTO dto = this.aeroService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message", "Data not found");
		}
		return "AeroSearch";
	}
}
