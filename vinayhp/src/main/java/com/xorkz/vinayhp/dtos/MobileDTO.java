package com.xorkz.vinayhp.dtos;

import lombok.Data;

@Data
public class MobileDTO {

	private String companyName;
	private String modelName;
	private String processor;
	private Integer storageInGB;
	private Integer ramInGB;
	private Integer androidVersion;
	private String mostUsedApp;
	private String sim;
	private Integer noOfSimSlots;
	private Long mobileNumber;
	
}
