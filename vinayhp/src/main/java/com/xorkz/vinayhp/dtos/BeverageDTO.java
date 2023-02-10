package com.xorkz.vinayhp.dtos;

import lombok.Data;

@Data
public class BeverageDTO {

	private String name;
	private Double price;
	private Double quantityInML;
	private String shopName;
	private String shopLocation;
	private String shopOwner;
	private String shopNumber;
	private Boolean fssaiCertified;
	private Integer noOfServers;
	private String upiID;
	
}
