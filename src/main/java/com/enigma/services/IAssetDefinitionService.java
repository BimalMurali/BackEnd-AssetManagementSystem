package com.enigma.services;

import java.util.List;


import com.enigma.entity.AssetDefinition;

public interface IAssetDefinitionService {
	
	//list
	public List<AssetDefinition>getAsset();
	
	//insert
	public AssetDefinition saveAsset(AssetDefinition asset);
	
	//update by id
	public AssetDefinition getAsset(int id);
	
	//delete
	public void deleteAsset(int id);
	
//	//search by name
//	public List<Employee> getEmployeeByName(String name);
//	
//	//inner join list
//	public List<EmployeeDeptDTO> getAllDtoEmployees();
	
	

}

