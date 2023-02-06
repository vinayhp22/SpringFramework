package com.xworkz.interview.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/give")
public class FoodItemComponent {
	public FoodItemComponent() {
		System.out.println("Created FoodItemComponent");
	}

	@PostMapping
	public String toSend(@RequestParam String name, @RequestParam String type, @RequestParam int quantity, @RequestParam double price) {
		System.out.println("Running toSend");
		System.out.println("Name : " + name);
		System.out.println("Type : " + type);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price : " + price);
		return "fooditem.jsp";
	}
}
