package com.enigma.repository;

import org.springframework.data.repository.CrudRepository;

import com.enigma.entity.AssetCreation;

public interface IAssetDefRepository extends CrudRepository<AssetCreation, Integer>{

}
