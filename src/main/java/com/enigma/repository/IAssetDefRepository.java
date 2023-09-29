package com.enigma.repository;

import org.springframework.data.repository.CrudRepository;

import com.enigma.entity.AssetDefinition;

public interface IAssetDefRepository extends CrudRepository<AssetDefinition, Integer>{

}
