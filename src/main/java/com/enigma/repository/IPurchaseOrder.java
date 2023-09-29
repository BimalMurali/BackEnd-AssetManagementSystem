package com.enigma.repository;

import org.springframework.data.repository.CrudRepository;

import com.enigma.entity.PurchaseOrder;

public interface IPurchaseOrder extends CrudRepository<PurchaseOrder, Integer> {

}
