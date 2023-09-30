package com.enigma.repository;

import org.springframework.data.repository.CrudRepository;

import com.enigma.entity.PurchaseOrder;

public interface IPurchaseOrderRepository extends CrudRepository<PurchaseOrder, Integer> {

}
