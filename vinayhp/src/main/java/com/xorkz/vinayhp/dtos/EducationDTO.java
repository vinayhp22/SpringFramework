package com.xorkz.vinayhp.dtos;

import lombok.Data;

@Data
public class EducationDTO {

	private String primarySchool;
	private String higherPrimarySchool;
	private String highSchool;
	private String puCollege;
	private String graduationCollege;
	private Double sslcPercentage;
	private Double pucPercentage;
	private Double degreeCGPA;
	private Integer noOfBacklogs;
	private Boolean degreeYearback;
}
