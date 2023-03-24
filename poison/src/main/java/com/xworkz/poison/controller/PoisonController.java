package com.xworkz.poison.controller;

import java.util.ArrayList;
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

import com.xworkz.poison.dto.PoisonDTO;
import com.xworkz.poison.service.PoisonService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class PoisonController {

	@Autowired
	private PoisonService poisonService;
	
	private List<String> type = Arrays.asList("Alcohol","Berries and Seeds", "Carbon Monoxide", "Food Poisoning", "Hazardous Chemicals", "Herbal Supplements", "Household Products");
	
	private List<String> country = Arrays.asList("India", "USA", "Australia", "UK", "Germany", "Russia", "Japan", "Egypt","Rome","Israel");
			
	public PoisonController() {
		log.info("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("poisonindia")
	public String onPoison(Model model) {
		log.info("Running onPoison getmapping");
		
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		
		return "Poison";
	}
	
	@PostMapping("poisonindia")
	public String onPoison(PoisonDTO dto, Model model) {
		log.info("Running onPoison postmapping");
		
		Set<ConstraintViolation<PoisonDTO>> violations = this.poisonService.validateAndSave(dto);
		if(violations.isEmpty()) {
			log.info("No violations in dto, going to save in database" + dto);
			model.addAttribute("dto",dto);
			return "PoisonSuccess";
		}
		log.error("Violations in onPoison, the dto  : "+dto);
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		model.addAttribute("dto",dto);
		model.addAttribute("errors",violations);
		return "Poison";
	}
	
	@GetMapping("search")
	public String onSearch(@RequestParam int id, Model model) {
		log.info("Running on search for id"+id);
		PoisonDTO dto = this.poisonService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
			log.info("Data found - controller" +dto);
		}else {
			model.addAttribute("message", "Data not found");
			log.info("Data not found - controller");
		}
		return "PoisonSearch";
	}
	
	@GetMapping("onSearchByCompany")
	public String onSearchByCompany(@RequestParam String company, Model model) {
		log.info("Running onSearchByCompany" + company);
		List<PoisonDTO> list = this.poisonService.findByCompany(company);
		if(list!=null && !list.isEmpty()) {
			model.addAttribute("list",list);
			log.info("list found in controller - onSearchByCompany");
		}else {
			log.info("list not found in controller - onSearchByCompany");
			model.addAttribute("message","Campany name is invalid, which is not present in the database");
		}
		return "SearchByCompany";
	}
	
	@GetMapping("update")
	public String onUpdate(@RequestParam int id, Model model) {
		log.info("onUpdate Getmapping");
		PoisonDTO dto = this.poisonService.findById(id);
		model.addAttribute("dto",dto);
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		return "UpdatePoison";
	}
	
	@PostMapping("update")
	public String onUpdate(PoisonDTO dto, Model model) {
		log.info("onUpdate PostMapping"+dto);
		Set<ConstraintViolation<PoisonDTO>> violations = this.poisonService.validateAndUpdate(dto);
		if(!violations.isEmpty()) {
			model.addAttribute("errors",violations);
		}else {
			model.addAttribute("dto",dto);
			model.addAttribute("type",type);
			model.addAttribute("country",country);
			model.addAttribute("message","Update Successful...");
			List<PoisonDTO> list = this.poisonService.list();
			if(list!=null && !list.isEmpty()) {
				model.addAttribute("list",list);
			}
		}
		
		return "UpdatePoisonList";
	}
	
	@GetMapping("delete")
	public String onDelete(@RequestParam int id, Model model) {
		log.info("onDelete GetMapping"+id);
		PoisonDTO dto = this.poisonService.delete(id);
		model.addAttribute("dto",dto);
		ArrayList<String> messages = new ArrayList<String>();
		messages.add("Data deleted successfully");
		{
		log.info("list in controller ");
			List<PoisonDTO> list = this.poisonService.list();
			if(list!=null && !list.isEmpty()) {
				model.addAttribute("list",list);
			}else {
				messages.add("And, no data found in database");
			}
			model.addAttribute("messages",messages);
		}
		return "PoisonList";
	}
	
	@GetMapping("list")
	public String onList(Model model) {
		log.info("list in controller");
		List<PoisonDTO> list = this.poisonService.list();
		if(list!=null && !list.isEmpty()) {
			model.addAttribute("list",list);
		}else {
			model.addAttribute("message","No data found in database");
		}
		return "PoisonList";
	}
	
	@GetMapping("searchByNameAndCompany")
	public String onSearchByNameAndCompany(@RequestParam String company, @RequestParam String name, Model model) {
		log.info("onSearchByNameAndCompany in controller");
		List<PoisonDTO> list = this.poisonService.searchByNameAndCompany(company, name);
		if(list!=null && !list.isEmpty()) {
			model.addAttribute("list",list);
		}else {
			List<PoisonDTO> findByCompany = this.poisonService.findByCompany(company);
			List<PoisonDTO> findByName = this.poisonService.findByName(name);
			List<PoisonDTO> findByTwo = new ArrayList<PoisonDTO>();
			findByTwo.addAll(findByCompany);
			findByTwo.addAll(findByName);
			if(findByTwo!=null && !findByTwo.isEmpty()) {
				model.addAttribute("list",findByTwo);
			}else {
				model.addAttribute("message","No data found in database");
			}
		}
		return "SearchByNameAndCompany";
	}
}
