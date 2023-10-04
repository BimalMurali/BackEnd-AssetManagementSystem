package com.enigma.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.enigma.entity.AssetCreation;

public interface IAssetCreationRepository extends CrudRepository<AssetCreation, Integer>{

	@Modifying
	@Transactional
	@Query("update AssetCreation e set e.isActive=false where e.id=:ID")
	public void deleteEmployee(@Param("ID") int id);
}
