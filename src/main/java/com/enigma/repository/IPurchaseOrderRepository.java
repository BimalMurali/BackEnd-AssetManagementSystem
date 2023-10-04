package com.enigma.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.enigma.entity.PurchaseOrder;

public interface IPurchaseOrderRepository extends CrudRepository<PurchaseOrder, Integer> {
	
	//delete
		@Modifying
		@Transactional
		@Query("UPDATE PurchaseOrder p SET p.isActive = false WHERE p.id = :Id")
		public void deleteId(@Param("Id") int id);
	
	
}
