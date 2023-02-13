package com.xworkz.egg.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import com.xworkz.egg.dto.CMDTO;

public interface CMService {

	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
	
}
