package com.enigma.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.enigma.entity.VendorCreation;






public interface IVendorCreationRepository extends CrudRepository<VendorCreation,Integer>{
	@Query("from VendorCreation WHERE vendorName like %?1%")
	public List<VendorCreation> findByVendorByName(String name);
	
	@Modifying
	@Transactional
//	@Query("UPDATE VendorCreation v set v.isActive = false where v.id =:vendorId")
//	public void deleteVendor(@Param("vendorId") int id);
	
	@Query("UPDATE com.enigma.entity.VendorCreation SET isActive=false where id=?1")
	public void deleteVendor(int id);

	
}
