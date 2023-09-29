package com.enigma.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.entity.VendorCreation;
import com.enigma.services.IVendorCreationService;





@RestController // @Controller+@Configuration
@RequestMapping("/api")
@CrossOrigin
public class VendorCreationController {
	
	@Autowired
	private IVendorCreationService vendorservice;
	//list
	@GetMapping("/vendor")
	public List<VendorCreation> getVendorDetails() throws AccessDeniedException{
		
		return vendorservice.getVendorDetails();
	}
	//id
	@GetMapping("/vendor/{id}")
	public VendorCreation getVendorDetails(@PathVariable int id) throws AccessDeniedException
	{
			return vendorservice.getVendorDetails(id);
	}
	
	//add
	
	//update
	@PutMapping("/vendor")
	public void updateVendor(@RequestBody VendorCreation vendor)
	{
		vendorservice.saveVendor(vendor);
	}
	//search by name
	/*@GetMapping("/vendor/search/{name}")
	public List<VendorCreation> getAllVendorsByName(@PathVariable String name,@RequestHeader(value="authorization",defaultValue="") String auth) throws AccessDeniedException {
		//jwtUtil.verify(auth);
		return vendorservice.getVendorByName(name);
	}*/
}
