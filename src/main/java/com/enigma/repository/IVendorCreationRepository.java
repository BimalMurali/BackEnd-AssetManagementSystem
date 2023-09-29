package com.enigma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nissan.entity.VendorCreation;


public interface IVendorCreationRepository extends CrudRepository<VendorCreation,Integer>{
	@Query("from VendorCreation WHERE vendorName like %?1%")
	public List<VendorCreation> findByVendorByName(String name);
}
