package com.xworkz.bigbasket.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.bigbasket.customvalidation.Password;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BigbasketDTO {
	
	private int id;
	
	@NotNull(message = "item should not be null")
	@NotEmpty(message = "item should not be empty")
	private String item;
	
	@Min(value = 1, message = "Minimun discountInPers is 1%")
	@Max(value = 100, message = "Minimun discountInPers is 100%")
	@NotNull(message = "discountInPers should not be null")
	private Integer discountInPers;
	
	@Min(value = 1, message = "Minimun quantityis 1")
	@NotNull(message = "quantity should not be null")
	private Integer quantity;
	
	@NotEmpty(message = "mfdDate should not be empty")
	private String mfdDate;
	
	@NotEmpty(message = "expiryDate should not be empty")
	private String expiryDate;
	
	@Size(min = 3, max= 20, message = "Customer Name should be more than 3 or less than 20 words")
	@NotNull(message = "Customer Name should not be null")
	@NotEmpty(message = "Customer Name should not be empty")
	private String custName;
	
	@NotNull(message = "mobileNumber should not be null")
	private Long mobileNumber;
	
	@NotNull(message = "email should not be null")
	@NotEmpty(message = "email should not be empty")
	private String email;
	
	@Password
	@Size(min = 8, max = 8, message = "password should be of 8 chars")
	@NotNull(message = "password should not be null")
	@NotEmpty(message = "password should not be empty")
	private String password;
	
	@NotNull(message = "area should not be null")
	@NotEmpty(message = "area should not be empty")
	private String area;
}
