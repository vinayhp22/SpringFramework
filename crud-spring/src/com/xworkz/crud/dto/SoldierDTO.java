package com.xworkz.crud.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstructAudutDTO {
	@NotNull(message = "name can't be null..")
	@NotBlank(message = "name can't be blank,,")
	@Size(min = 4, max = 20, message = "characters for name: minimum is 4 & maximum is 20")
	private String name;
	@Min(1)
	@Max(50000)
	private int id;
	@NotNull(message = "rank can't be null..")
	@NotBlank
	@Size(min = 5, max = 100, message = "characters for rank: minimum is 4 & maximum is 20")
	private String rank;
	@NotNull(message = "batallion can't be null..")
	@NotBlank
	@Size(min = 5, max = 100, message = "characters for batallion: minimum is 4 & maximum is 20")
	private String batallion;
	@NotNull(message = "country can't be null..")
	@NotBlank
	@Size(min = 5, max = 100, message = "characters for country: minimum is 4 & maximum is 20")
	private String country;

	
	
}
