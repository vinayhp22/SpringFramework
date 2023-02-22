package com.xworkz.aeroplane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "aeroindia")
public class AeroEntity {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "aero_company")
	private String company;
	
	@Column(name = "aero_name")
	private String name;
	
	@Column(name = "aero_cost")
	private Double cost;

	@Column(name = "aero_type")
	private String type;

	@Column(name = "aero_country")
	private String country;
}
