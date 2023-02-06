package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class CasinoDTO {

	private String name;
	private String cruise;
	private Double entryFee;
	private boolean freeFood;
	
	public CasinoDTO() {
		System.out.println("Created CasinoDTO using no-arg const...");
	}

	@Override
	public String toString() {
		return "CasinoDTO [name=" + name + ", cruise=" + cruise + ", entryFee=" + entryFee + ", freeFood=" + freeFood
				+ "]";
	}
	
}
