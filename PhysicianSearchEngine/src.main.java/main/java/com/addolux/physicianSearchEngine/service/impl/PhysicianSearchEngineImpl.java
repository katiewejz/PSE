package main.java.com.addolux.physicianSearchEngine.service.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.com.addolux.physicianSearchEngine.dto.PhysicianSearchEngineDTO;

public class PhysicianSearchEngineImpl implements PhysicianSearchEngineService {

	@Override
	public List<PhysicianSearchEngineDTO> getAllPurchaseRequests() {
		return getDummyPurchaseRequestData();
	}

	private List<PhysicianSearchEngineDTO> getDummyPurchaseRequestData() {
		List<PhysicianSearchEngineDTO> physicianSearchDTOs = new ArrayList<PhysicianSearchEngineDTO>(); 
		// Create																		
		// purchaseRequestDTOs;																			
		// }
	}

}
