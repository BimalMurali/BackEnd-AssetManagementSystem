package com.enigma.services;

import java.util.List;

import com.nissan.entity.VendorCreation;

public interface IVendorCreationService {

	// list
		public List<VendorCreation> getVendorDetails();

		// insert
		public VendorCreation saveVendor(VendorCreation vendor);

		// update by id
		public VendorCreation getVendorDetails(int id);

		// delete
		public void deleteVendor(int id);

		// search by name
		public List<VendorCreation> getVendorByName(String name);

		// update by id
		public VendorCreation updateVendor(VendorCreation vendor);
}
