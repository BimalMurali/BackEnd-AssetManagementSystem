package com.enigma.repository;

import org.springframework.data.repository.CrudRepository;

import com.nissan.entity.PurchaseOrder;

public interface IPurchaseOrder extends CrudRepository<PurchaseOrder, Integer> {

}
