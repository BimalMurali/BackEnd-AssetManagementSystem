package com.enigma.services;

import java.util.List;

import com.enigma.entity.AssetCreation;
import com.enigma.entity.AssetDefinition;


public interface IAssetCreationService {
	//list
	public List<AssetCreation>getAssetDefinition();
	
	//insert
	public AssetCreation saveAsset(AssetCreation asset);
	
	//delete by id
	public void deleteAssetCreation(int id);
	
	//update by id
	public AssetCreation updateAsset(int id);
	
	
	

}
