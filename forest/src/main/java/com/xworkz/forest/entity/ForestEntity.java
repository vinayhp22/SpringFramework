package com.xworkz.forest.entity;

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
@NamedQuery(name = "findByState", query = "select aranya from ForestEntity aranya where aranya.state = 'Karnataka'")
@NamedQuery(name = "findByNameAndStateAndArea", query = "select aranya from ForestEntity aranya where aranya.state = 'Karnataka' and aranya.state = 'Karnataka' and aranya.area =  'Chamrajnagar'")
@NamedQuery(name = "findAreaByName", query = "select aranya.area from ForestEntity aranya where aranya.name = 'Bandipur'")
@NamedQuery(name = "findIdByNameAndState", query = "select aranya.id from ForestEntity aranya where aranya.name = 'Bandipur' and aranya.state = 'Karnataka'")
@NamedQuery(name = "findNameById", query = "select aranya.name from ForestEntity aranya where aranya.id = 2")
@NamedQuery(name = "findStateByNameAndArea", query = "select aranya.state from ForestEntity aranya where aranya.name = 'Bandipur' and aranya.area =  'Chamrajnagar'")
//@NamedQuery(name = "findMaxArea", query = "select aranya.area from ForestEntity aranya where aranya.")
@NamedQuery(name = "findCount", query = "select count(aranya) from ForestEntity aranya")
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
