package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.entity.AssetDefinition;
import com.enigma.repository.IAssetDefinitionRepository;
@Service
public class AssetDefinitionServiceImple implements IAssetDefinitionService {


	@Autowired
	private IAssetDefinitionRepository assetDefRepo;
//	@Autowired
//	private Validation validation;
	
	//list
	public List<AssetDefinition> getAsset() {
		// TODO Auto-generated method stub
		return (List<AssetDefinition>) assetDefRepo.findAll();
	}


	public AssetDefinition getAsset(int id) {
		return assetDefRepo.findById(id)
				.orElseThrow(()-> new
				RuntimeException("Asset not found for id"+id));
	}

	
	//delete
	@Override
	public void deleteAsset(int id) {
		assetDefRepo.deleteId(id);
	}

	
	public AssetDefinition saveAsset(AssetDefinition asset) {
		// TODO Auto-generated method stub
		return assetDefRepo.save(asset);
	}



	
//	public List<AssetDefinition> getEmployeeByName(String name) {
//		// TODO Auto-generated method stub
//		return assetDefRepo.findByAssetName(name);
//	}

	
//
//	@Override
//	public List<EmployeeDeptDTO> getAllDtoEmployees() {
//		// TODO Auto-generated method stub
//		return employeeRepo.findAllDTOEmployees();
//		}
}