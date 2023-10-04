package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.entity.PurchaseOrder;
import com.enigma.repository.IPurchaseOrderRepository;


@Service
public class PurchaseOrderService implements IPurchaseOrderService {

	@Autowired
	private IPurchaseOrderRepository purchaseOrderRepo;

	//List the orders
	@Override
	public List<PurchaseOrder> getOrders() {
		// TODO Auto-generated method stub
		return (List<PurchaseOrder>) purchaseOrderRepo.findAll();
	}

	//Insert orders
	@Override
	public PurchaseOrder saveOrders(PurchaseOrder purchaseOrder) {
		// TODO Auto-generated method stub
		return purchaseOrderRepo.save(purchaseOrder);
	}

	
//	@Override
//	public PurchaseOrder getOrders(int id) {
//		// TODO Auto-generated method stub
//		return purchaseOrderRepo.findById(id).orElseThrow(()->new RuntimeException("Id not found"));
//	}

	//Delete order
	@Override
	public void deleteOrders(int id) {
		// TODO Auto-generated method stub
		purchaseOrderRepo.deleteId(id);
		
		
	}


	
	

}
