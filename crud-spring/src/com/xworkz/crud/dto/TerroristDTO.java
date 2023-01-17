package com.xworkz.crud.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NonNull
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TerroristDTO extends AbstructAudutDTO{
	@NotNull(message = "Name cannot be null.")
	@Size(min = 3, max = 20, message = "Name should be more than 3 characters & less than 20 characters")
	private String name;
	@NotNull(message = "Age cannot be null.")
	@Min(value = 1, message = "Age should be greater than 1 or less than 120.")
	@Max(value = 1, message = "Age should be greater than 1 or less than 120.")
	private int age;
	@NotNull(message = "Country cannot be null")
	private String country;
	private boolean alive;
	private boolean prison;
	@NotNull(message = "Specialization cannot be null")
	private String specialization;
	@NotNull(message = "Organization cannot be null")
	private String organization;
	
}
