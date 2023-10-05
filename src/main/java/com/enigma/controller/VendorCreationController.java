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
import com.enigma.entity.VendorCreation;
import com.enigma.services.IVendorCreationService;







@RestController // @Controller+@Configuration
@RequestMapping("/api")
@CrossOrigin
public class VendorCreationController {
	
	@Autowired
	private IVendorCreationService vendorservice;
	
	@Autowired 	
	private APIResponse apiResponse;

	//list
	@GetMapping("/vendors")
	public List<VendorCreation> getVendorDetails() throws AccessDeniedException{
		
		return vendorservice.getVendorDetails();
	}
//	//id
//	@GetMapping("/vendors/{id}")
//	public VendorCreation getVendorDetails(@PathVariable int id) throws AccessDeniedException
//	{
//			return vendorservice.getVendorDetails(id);
//	}
//	
	//add
	@PostMapping("/vendors")
	public ResponseEntity<APIResponse> addVendor(@RequestBody VendorCreation vendor){
	//	System.out.println("hiii");
		if(vendorservice.saveVendor(vendor)==null) {
			apiResponse.setData("Name can have only alphabets");
			apiResponse.setStatus(500);
			apiResponse.setError("INVALID NAME");
			
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("VENDOR ADDED SUCCESSFULLY");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		
	}
	//update
	@PutMapping("/vendors")
	public ResponseEntity<APIResponse> updateVendor(@RequestBody VendorCreation vendor) {
		if(vendorservice.saveVendor(vendor)==null) {
			apiResponse.setData("Name can have only alphabets");
			apiResponse.setStatus(500);
			apiResponse.setError("INVALID NAME");
			
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("VENDOR UPDATED SUCCESSFULLY");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		
	}
	
	//disable or delete employee
		@GetMapping("/vendors/{id}")
		public void deleteVendors(@PathVariable int id) {
			vendorservice.deleteVendors(id);
		}
		
		
	//search by name
	/*@GetMapping("/vendor/search/{name}")
	public List<VendorCreation> getAllVendorsByName(@PathVariable String name,@RequestHeader(value="authorization",defaultValue="") String auth) throws AccessDeniedException {
		//jwtUtil.verify(auth);
		return vendorservice.getVendorByName(name);
	}*/
	
}
