package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.entity.AssetDefinition;
import com.enigma.entity.AssetType;
import com.enigma.repository.IAssetDefinitionRepository;
import com.enigma.repository.IAssetTypeRepository;
@Service
public class AssetTypeServiceImple implements IAssetTypeService{

	@Autowired
	private IAssetTypeRepository assetTypeRepo;
	
	public List<AssetType> getAsset() {
		// TODO Auto-generated method stub
		return (List<AssetType>) assetTypeRepo.findAll();
	}

}
