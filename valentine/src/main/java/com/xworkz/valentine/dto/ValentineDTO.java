package com.xworkz.valentine.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "valentine")
@Entity
public class ValentineDTO {
	@Column(name = "v_id")
	@Id
	private int id;
	
	@Column(name = "name")
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or more than 20 characters")
	private String name;
	
	@Column(name = "valentine_name")
	@Size(min = 3, max = 20, message = "Valentine Name cannot be less than 3 or more than 20 characters")
	private String valentineName;
	
	@Column(name = "v_places")
	@NotBlank(message = "Place should be selected")
	private String places;
	
	@Column(name = "v_gifts")
	@NotBlank(message = "Gift should be selected")
	private String gifts;
}
