package com.enigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.entity.AssetCreation;
import com.enigma.repository.IAssetCreationRepository;
@Service
public class AssetCreationServiceImple implements IAssetCreationService {
	@Autowired
	private IAssetCreationRepository assetRepo;

//	list asset
	public List<AssetCreation> getAssetDefinition() {
		// TODO Auto-generated method stub
		return (List<AssetCreation>) assetRepo.findAll();
	}


//	save asset
	public AssetCreation saveAsset(AssetCreation asset) {
		return assetRepo.save(asset);
	}



//	delete asset by id
	public void deleteAssetCreation(int id) {
		assetRepo.deleteById(id);
		
	}


	public AssetCreation updateAsset(int id) {
		return null;
	}

}
