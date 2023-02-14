package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CMDTO;
import com.xworkz.egg.service.CMService;

@Controller
@RequestMapping("/")
public class CMController {

	@Autowired
	private CMService cmService;
	
	public CMController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping("/cmo")
	public String onSave(CMDTO cmdto, Model model) {
		System.out.println("Running onSave in CMController"+cmdto);
		Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmService.validateAndSave(cmdto);
		
		if (!constraintViolations.isEmpty()) {
			System.err.println("Validation failed, displaying error message");
			constraintViolations.forEach(cv->System.out.println(cv.getMessage()));
		} else {
			System.out.println("Validation success, display success message..");
		}
		
		return "CM";
	}
	
}
