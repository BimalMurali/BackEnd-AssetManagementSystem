package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.entity.AssetDefinition;
import com.enigma.repository.IAssetDefRepository;
@Service
public class AssetDefServiceImple implements IAssetDefService {
	@Autowired
	private IAssetDefRepository assetRepo;

	
	public List<AssetDefinition> getAssetDefinition() {
		// TODO Auto-generated method stub
		return (List<AssetDefinition>) assetRepo.findAll();
	}

}
