package com.enigma.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="AssetDefinition")
public class AssetDefinition {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="assetName",nullable=false,length=60)
	private String assetName;
	
	private int assetTypeId;
	@ManyToOne
	@JoinColumn(name="assetTypeId",insertable=false,updatable=false)
	private AssetType assetType;
	
	@Column(name="category",nullable=false,length=60)
	private String category;
	
	@Column(name="isActive")
	private boolean isActive=true;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public int getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public AssetDefinition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssetDefinition(Integer id, String assetName, AssetType assetType, String category) {
		super();
		this.id = id;
		this.assetName = assetName;
		this.assetType = assetType;
		this.category = category;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "AssetDefinition [id=" + id + ", assetName=" + assetName + ", assetTypeId=" + assetTypeId
				+ ", assetType=" + assetType + ", category=" + category + ", isActive=" + isActive + "]";
	}

	
	
	

	
	
}
	
