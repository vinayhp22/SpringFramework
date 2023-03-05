package com.xworkz.poison.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PoisonDTO {

	private int id;
	@NotNull(message = "comapany can't be null")
	@Size(min = 3, max = 20, message = "company should be greater than 3 or less than 20 chars")
	private String company;
	
	@NotNull(message = "name can't be null")
	@Size(min = 3, max = 20, message = "name should be greater than 3 or less than 20 chars")
	private String name;
	
	@NotNull(message = "cost can't be null")
	@Min(value = 1, message = "cost can't be negative value")
	private Double cost;
	
	private String type;
	
	private String country;
	
}
