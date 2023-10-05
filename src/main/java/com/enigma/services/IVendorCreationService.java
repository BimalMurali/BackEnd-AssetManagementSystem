package com.enigma.services;

import java.util.List;

import com.enigma.entity.VendorCreation;

public interface IVendorCreationService {

	// list
		public List<VendorCreation> getVendorDetails();

		// insert
		public VendorCreation saveVendor(VendorCreation vendor);

		// get by id
		public VendorCreation getVendorDetails(int id);


		// update by id
		public VendorCreation updateVendor(VendorCreation vendor);

		//delete vendor
		public void deleteVendors(int id);
}
