package com.xworkz.validation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AbstructAudutDTO {
	
	public String createdBy;
	public int createdAt;
	public String updatedBy;
	public int updatedAt;
	
}
