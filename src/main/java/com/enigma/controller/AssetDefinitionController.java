package com.enigma.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.common.APIResponse;
import com.enigma.entity.AssetDefinition;
import com.enigma.entity.AssetType;
import com.enigma.services.IAssetDefinitionService;


@CrossOrigin
@RestController //@Controller+@Configuration
@RequestMapping("/api")

public class AssetDefinitionController {
	
	
	@Autowired
	private IAssetDefinitionService assetDefinitionService;
	
	@Autowired
	private APIResponse apiResponse;
	
//	@Autowired
//	private JwtUtil jwtUtil;
	
	
	//list
//	@GetMapping("/assets")
//	public List<AssetType> getAsset(@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException{
//		//jwtUtil.verify(auth);
//		return assetDefinitionService.getAsset();
//	}
	
	@GetMapping("/assettype")
	public List<AssetDefinition> getAsset(@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException{
		//jwtUtil.verify(auth);
		return assetDefinitionService.getAsset();
	}
	
	
	//search by id
	@GetMapping("/assets/{id}")
	public AssetDefinition getAsset(@PathVariable int id,@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException {
		//jwtUtil.verify(auth);
		return assetDefinitionService.getAsset(id);
		
	}

	//add
	@PostMapping("/assets")
	public ResponseEntity<APIResponse> addAsset(@RequestBody AssetDefinition asset){
		if(assetDefinitionService.saveAsset(asset)==null) {
			apiResponse.setData(("Name can have only alphabets"));
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid name");
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Asset added sucessfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		
	}
	
	//update 
	@PutMapping("/assets")
	public ResponseEntity<APIResponse> updateAsset(@RequestBody AssetDefinition asset){
		if(assetDefinitionService.saveAsset(asset)==null) {
			apiResponse.setData(("Name can have only alphabets"));
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid name");
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Asset updated sucessfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		
	}
	
	//disable or delete employee
	@GetMapping("/asset/{id}")
	public void deleteAsset(@PathVariable int id,
			
		@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		assetDefinitionService.deleteAsset(id);
		
	}
	
//	//search by name
//	@GetMapping("/employees/search/{name}")
//	public List<Employee> getAllEmployeesByName(@PathVariable String name,@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException{
//		//jwtUtil.verify(auth);
//		return employeeService.getEmployeeByName(name);
//	}
//	
//	//inner join to fetch details from both tables
//	@GetMapping("/employees/dto")
//	public List<EmployeeDeptDTO>getAllDTOEmployees(){
//		return employeeService.getAllDtoEmployees();
//	}
	
	
	}
