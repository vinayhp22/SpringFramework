package com.xworkz.validation.service;

import com.xworkz.validation.dto.MissileDTO;

public interface MissileService {

	boolean validateAndSave(MissileDTO dto);
}
