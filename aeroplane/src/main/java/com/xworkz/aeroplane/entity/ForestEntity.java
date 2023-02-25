package com.xworkz.aeroplane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "forest_table")
@NamedQuery(name = "findByName", query = "select aranya from ForestEntity aranya where aranya.name = 'Bandipur'")
public class ForestEntity {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "state")
	private String state;

	@Column(name = "area")
	private String area;

	@Column(name = "type")
	private String type;


}
