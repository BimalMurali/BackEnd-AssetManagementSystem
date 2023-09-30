package com.enigma.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.common.APIResponse;
import com.enigma.entity.PurchaseOrder;
import com.enigma.services.IPurchaseOrderService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class PurchaseOrderController {

	@Autowired
	private IPurchaseOrderService purchaseOrderService;

	@Autowired
	private APIResponse apiResponse;

	// list
	@GetMapping("/purchaseorders")
	public List<PurchaseOrder> getOrders(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verify(auth);
		return purchaseOrderService.getOrders();
	}

	// add
	@PostMapping("/purchaseorders")
	public ResponseEntity<APIResponse> addEmployee(@RequestBody PurchaseOrder purchaseOrder,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		if (purchaseOrderService.saveOrders(purchaseOrder) == null) {
			apiResponse.setData("Name can have only alphabets");
			apiResponse.setStatus(500);
			apiResponse.setError("INVALID NAME");
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("ORDERS ADDED SUCCESSFULLY");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

	// update
	@PutMapping("/purchaseorders")
	public ResponseEntity<APIResponse> updateAsset(@RequestBody PurchaseOrder purchaseOrder) {
		if (purchaseOrderService.saveOrders(purchaseOrder) == null) {
			apiResponse.setData(("Name can have only alphabets"));
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid name");
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Purchase Orders updated sucessfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}

	// disable or delete employee
	@DeleteMapping("/purchaseorders/{id}")
	public void deleteOrders(@PathVariable int id,
			@RequestHeader(value = "authorization", defaultValue = "") String auth) throws AccessDeniedException {
		// jwtUtil.verify(auth);
		purchaseOrderService.deleteOrders(id);

	}
}
