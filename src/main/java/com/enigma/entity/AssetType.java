
package com.enigma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AssetType")
public class AssetType {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="assetType",nullable=false,length=60)
	private String assetType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public AssetType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssetType(Integer id, String assetType) {
		super();
		this.id = id;
		this.assetType = assetType;
	}

	@Override
	public String toString() {
		return "AssetDefiniton [id=" + id + ", assetType=" + assetType + "]";
	}
	
}
	
	
