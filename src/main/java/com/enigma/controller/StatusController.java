package com.enigma.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.common.APIResponse;
import com.enigma.entity.Status;
import com.enigma.services.IStatusService;


@CrossOrigin
@RestController
@RequestMapping("api")
public class StatusController {
	
	@Autowired
	private IStatusService statusservice;

	@Autowired
	private APIResponse apiResponse;

	// list
	@GetMapping("/status")
	public List<Status> getOrders(@RequestHeader(value = "authorization", defaultValue = "") String auth)
			throws AccessDeniedException {
		// jwtUtil.verify(auth);
		return statusservice.getStatus();
	}

}
