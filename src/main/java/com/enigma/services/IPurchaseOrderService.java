package com.enigma.services;

import java.util.List;

import com.enigma.entity.PurchaseOrder;


public interface IPurchaseOrderService {
	
	// list
		public List<PurchaseOrder> getOrders();
		
	    //insert
		public PurchaseOrder saveOrders(PurchaseOrder purchaseOrder);

//		//update by id
//		public PurchaseOrder getOrders(int id);

		//delete
		public void deleteOrders(int id);

}
