package com.enigma.services;

import java.util.List;

import com.enigma.entity.AssetCreation;


public interface IAssetCreationService {
	//list
	public List<AssetCreation>getAssetDefinition();
	
	//save
	public AssetCreation saveAsset(AssetCreation asset);
	

}
