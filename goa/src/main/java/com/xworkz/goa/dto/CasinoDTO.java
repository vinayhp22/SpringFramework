package com.xworkz.goa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table(name = "casino_table")
public class CasinoDTO {

	@Column(name = "id_casino_table")
	private int id;
	@Column(name = "casino_name")
	private String name;
	@Column(name = "casino_cruise")
	private String cruise;
	@Column(name = "casino_entry_fee")
	private Double entryFee;
	@Column(name = "casino_free_food")
	private boolean freeFood;

	public CasinoDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
