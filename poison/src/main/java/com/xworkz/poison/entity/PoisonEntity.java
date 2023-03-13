package com.xworkz.poison.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "poisonindia")
@NamedQuery(name = "findByCompany", query = "select entity from PoisonEntity entity where entity.company=:bycompany")
@NamedQuery(name = "findByName", query = "select entity from PoisonEntity entity where entity.name=:byname")
@NamedQuery(name = "list", query = "select entity from PoisonEntity entity")
@NamedQuery(name = "searchByNameAndCompany", query = "select entity from PoisonEntity entity where entity.company=:bycompany and entity.name=:byname")
public class PoisonEntity {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "poison_company")
	private String company;
	
	@Column(name = "poison_name")
	private String name;
	
	@Column(name = "poison_cost")
	private Double cost;

	@Column(name = "poison_type")
	private String type;

	@Column(name = "poison_country")
	private String country;
}
