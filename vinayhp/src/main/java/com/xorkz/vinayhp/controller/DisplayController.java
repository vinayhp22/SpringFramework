package com.xorkz.vinayhp.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xorkz.vinayhp.dtos.BeverageDTO;
import com.xorkz.vinayhp.dtos.EducationDTO;
import com.xorkz.vinayhp.dtos.FamilyDTO;
import com.xorkz.vinayhp.dtos.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {
	public DisplayController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/email")
	public String onMail(Model model) {
		System.out.println("running doMail");
		model.addAttribute("email", "vinayhp.xworkz@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/number")
	public String onNumber(Model model) {
		System.out.println("Running onNumber");
		model.addAttribute("number", 8970877229l);
		return "index.jsp";
	}

	@GetMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("Running onNumber");
		model.addAttribute("aadhar", 741168512167l);
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running onAge");
		model.addAttribute("age", 25);
		return "index.jsp";
	}
	
	@GetMapping("/dob")
	public String onDOB(Model model) {
		System.out.println("running onDOB");
		model.addAttribute("dob",LocalDateTime.of(1998, 12, 22, 12, 0));
		return "index.jsp";
	}
	
	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running onSalary");
		model.addAttribute("salary", "4lpa");
		return "index.jsp";
	}
	
	@GetMapping("/friends")
	public String onFriends(Model model) {
		System.out.println("running onFriends");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Sahana");
		friends.add("Prashant");
		friends.add("Rudresh swamy");
		friends.add("Sahana GN");
		friends.add("Akshay Joshi");
		friends.add("Shubham");
		model.addAttribute("friends", friends);
		
		return "index.jsp";
	}
	
	@GetMapping("/skillset")
	public String onSkillSet(Model model) {
		System.out.println("Running onSkillSet");
		List<String> skills = new ArrayList<String>();
		skills.add("Core Java");
		skills.add("Springs-Framework");
		skills.add("MySQL");
		skills.add("HTML");
		skills.add("CSS");
		skills.add("Bootstrap");
		model.addAttribute("skillset", skills);
		return "index.jsp";

	}
	
	@GetMapping("/education")
	public String onEducationDTO(EducationDTO dto, Model model) {
		System.out.println("Running onEducationDTO");
		dto.setPrimarySchool("GPS,Hanumanthapura");
		dto.setHigherPrimarySchool("MDRS, Madhugiri");
		dto.setHighSchool("MDRS, Madhugiri");
		dto.setPuCollege("Sarvodaya PU College, Tumkur");
		dto.setGraduationCollege("SCE, Bengaluru");
		dto.setSslcPercentage(82.40);
		dto.setPucPercentage(79.60);
		dto.setDegreeCGPA(6.51);
		dto.setNoOfBacklogs(3);
		dto.setDegreeYearback(false);
		model.addAttribute("education", dto);
		return "index.jsp"; 
	}
	
	@GetMapping("/family")
	public String onFamilyDTO(FamilyDTO dto, Model model) {
		System.out.println("running onFamilyDTO");
		dto.setManeDevru("tirupati Thimmappa");
		dto.setFatherName("Paramesh");
		dto.setMotherName("hemalatha");
		dto.setSisterName("Prathiba");
		dto.setUncleName("Manju");
		dto.setNoOfchildrens(2);
		dto.setNoOfElders(2);
		dto.setMostEducated("Paramesh");
		dto.setMostElder("Neelamma");
		dto.setVillageName("Hanumanthapura");
		model.addAttribute("family", dto);
		return "index.jsp"; 
	}
	
	@GetMapping("/mobile")
	public String onMobileDTO(MobileDTO dto, Model model) {
		System.out.println("running onMobileDTO");
		dto.setCompanyName("Oneplus");
		dto.setModelName("Nord");
		dto.setProcessor("Qualcomm SDM765G 5G Octa-core");
		dto.setStorageInGB(256);
		dto.setRamInGB(12);
		dto.setAndroidVersion(12);
		dto.setMostUsedApp("Chrome");
		dto.setSim("Jio");
		dto.setNoOfSimSlots(2);
		dto.setMobileNumber(8970877229l);
		model.addAttribute("mobile", dto);
		return "index.jsp"; 
	}
	
	@GetMapping("/beverage")
	public String onBeverageDTO(BeverageDTO dto, Model model) {
		System.out.println("Running onBeverageDTO");
		dto.setName("Mix-Fruit Milkshake");
		dto.setPrice(50d);
		dto.setQuantityInML(500d);
		dto.setShopName("Xworkz Juice Center");
		dto.setShopLocation("Bashyam Circle");
		dto.setShopOwner("Omkar Sir");
		dto.setShopNumber("FAAHAH85A4A77");
		dto.setFssaiCertified(false);
		dto.setNoOfServers(6);
		dto.setUpiID("8970877229@ybl");
		model.addAttribute("beverage", dto);
		return "index.jsp"; 		
	}
}
