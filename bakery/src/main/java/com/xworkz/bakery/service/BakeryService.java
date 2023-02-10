package com.xworkz.bakery.service;

import com.xworkz.bakery.dto.BakeryDTO;

public interface BakeryService {

	boolean validateAndSave(BakeryDTO dto);
}
