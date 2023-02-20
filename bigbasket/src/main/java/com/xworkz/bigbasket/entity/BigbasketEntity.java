package com.xworkz.bigbasket.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.bigbasket.customvalidation.Password;

import lombok.Data;

@Entity
@Table(name = "bigbasket")
@Data
public class BigbasketEntity {

	@Column(name = "Id")
	@Id
	private int id;
	
	@Column(name = "item")
	private String item;
	
	@Column(name = "discount_in_persentage")
	private Integer discountInPers;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "mfdDate")
	private String mfdDate;
	
	@Column(name = "expiry_date")
	private String expiryDate;
	
	@Column(name = "cust_name")
	private String custName;
	
	@Column(name = "mobile_number")
	private Long mobileNumber;
	
	@Column(name = "email")
	private String email;
	
	@Password
	@Column(name = "password")
	private String password;
	
	@Column(name = "area")
	private String area;
}
