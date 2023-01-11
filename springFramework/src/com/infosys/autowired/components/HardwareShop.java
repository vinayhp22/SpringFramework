package com.infosys.autowired.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {

	@Autowired
	private int id;
	@Autowired
	@Qualifier("boss")
	private String name;
	@Autowired
	private long gstNo;
	@Autowired
	private String ownerName;
	@Autowired
	private String address;

	public HardwareShop() {
		System.out.println("Created HardwareShop...");
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}
