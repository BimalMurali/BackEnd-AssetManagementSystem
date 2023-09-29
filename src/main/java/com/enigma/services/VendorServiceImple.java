package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.repository.IVendorCreationRepository;
import com.nissan.entity.VendorCreation;
import com.nissan.model.Customer;
import com.nissan.repo.IAdminRepository;

@Service
public class VendorServiceImple implements IVendorCreationService{
	
	@Autowired
	private IVendorCreationRepository vendorrepo;

	@Override
	public List<VendorCreation> getVendorDetails() {
		
		return (List<VendorCreation>) vendorrepo.findAll();
	}

	@Override
	public VendorCreation saveVendor(VendorCreation vendor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VendorCreation getVendorDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVendor(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VendorCreation> getVendorByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VendorCreation updateVendor(VendorCreation vendor) {
		// TODO Auto-generated method stub
		return null;
	}

}
