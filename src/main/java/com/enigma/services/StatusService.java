package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.entity.Status;
import com.enigma.repository.IStatusRepository;

@Service
public class StatusService implements IStatusService {
	
	@Autowired
	private IStatusRepository statusRepo;

	@Override
	public List<Status> getStatus() {
		// TODO Auto-generated method stub
		return (List<Status>)statusRepo.findAll();
	}

}
