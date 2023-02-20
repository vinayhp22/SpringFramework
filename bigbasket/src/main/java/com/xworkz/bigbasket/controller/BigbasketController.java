package com.xworkz.bigbasket.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.bigbasket.dto.BigbasketDTO;
import com.xworkz.bigbasket.service.BigbasketService;

@Controller
@RequestMapping("/bigbasket")
public class BigbasketController {

	@Autowired
	private BigbasketService bigbasketService;

	private List<String> item = Arrays.asList("Kashmir Apple", "Grapes", "Atta", "Rice", "Dal", "Edible Oil", "Ghee",
			"Salt");

	private List<String> area = Arrays.asList("BTM Layout", "BasaveshwarNagar", "R T Nagar", "Rajaji Nagar",
			"Yeshwanthpur", "Yelahanka", "Nelamangala");

	public BigbasketController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onBigbasket(Model model) {
		System.out.println("onBigbasket getMapping");
		
		model.addAttribute("item", item);
		model.addAttribute("area", area);
		
		return "Bigbasket";
	}

	@PostMapping
	public String onBigbasket(Model model, BigbasketDTO dto) {
		System.out.println("onBigbasket postMapping"+dto);
		
		Set<ConstraintViolation<BigbasketDTO>> constraintViolations = this.bigbasketService.validateAndSave(dto);
		if (constraintViolations.isEmpty()){

			System.out.println("no violations, going save the details");
			return "BigbasketSuccess";
		}
		
		model.addAttribute("item", item);
		model.addAttribute("area", area);
		model.addAttribute("errors", constraintViolations);
		model.addAttribute("dto", dto);
		System.err.println("Violations in onBigbasket, the dto  : "+dto);
		
		return "Bigbasket";
	}

}
