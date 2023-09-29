package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.entity.VendorCreation;
import com.enigma.repository.IVendorCreationRepository;


@Service
public class VendorServiceImple implements IVendorCreationService{
	
	@Autowired
	private IVendorCreationRepository vendorrepo;


	public List<VendorCreation> getVendorDetails() {
	
		return(List<VendorCreation>) vendorrepo.findAll();
	}

	
	public VendorCreation saveVendor(VendorCreation vendor) {
		// TODO Auto-generated method stub
		return null;
	}


	public VendorCreation getVendorDetails(int id) {
		
		return null;
	}


	public List<VendorCreation> getVendorByName(String name) {
	
		return null;
	}

	
	

}
