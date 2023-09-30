package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.enigma.common.Validation;
//import com.nissan.dto.EmployeeDeptDTO;
import com.enigma.entity.AssetDefinition;
import com.enigma.repository.IAssetDefinitionRepository;
@Service
public class AssetDefinitionServiceImpl implements IAssetDefinitionService {

	@Autowired
	private IAssetDefinitionRepository assetDefRepo;
//	@Autowired
//	private Validation validation;
	public List<AssetDefinition> getAsset() {
		// TODO Auto-generated method stub
		return (List<AssetDefinition>) assetDefRepo.findAll();
	}

//	public AssetDefinition saveAsset(AssetDefinition Asset) {
////		if(validation.isNameValid(employee.getEmployeename())) {
////		return employeeRepo.save(employee);
////		}
////		return employee;
//	}

	public AssetDefinition getAsset(int id) {
		return assetDefRepo.findById(id)
				.orElseThrow(()-> new
				RuntimeException("Asset not found for id"+id));
	}

	public void deleteAsset(int id) {
		assetDefRepo.deleteById(id);
	}

	@Override
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
