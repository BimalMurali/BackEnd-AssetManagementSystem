package com.enigma.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AssetCreation")
public class AssetCreation {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	
	private Integer VendorAssetTypeID;
	@ManyToOne
	@JoinColumn(name="VendorAssetTypeID",insertable=false,updatable=false)
	private VendorCreation vendors;
	
	@Column(name="make",nullable=false,length=60)
	private String make;
	
	
	private int modelId;
	@ManyToOne
	@JoinColumn(name="modelId",insertable=false,updatable=false)
	private AssetDefinition assetdef;

	private boolean isActive=true;

	
	
	@Column(name="serialNo",nullable=false,length=60)
	private String serialNo;

	
	@Column(name="yearOfManufacture",nullable=false,length=60)
	private String yearOfManufacture;
	
	@Column(name="purchaseDate",nullable=false,length=60)
	private Date purchaseDate;


	@Column(name="warrranty",nullable=false,length=60)
	private String warrranty;
	
	@Column(name="fromDate",nullable=false,length=60)
	private Date fromDate;

	@Column(name="toDate",nullable=false,length=60)
	private Date toDate;

	public AssetCreation(Integer id, Integer vendorAssetTypeID, VendorCreation vendors, String make, int modelId,
			AssetDefinition assetdef, boolean isActive, String serialNo, String yearOfManufacture, Date purchaseDate,
			String warrranty, Date fromDate, Date toDate) {
		super();
		this.id = id;
		VendorAssetTypeID = vendorAssetTypeID;
		this.vendors = vendors;
		this.make = make;
		this.modelId = modelId;
		this.assetdef = assetdef;
		this.isActive = isActive;
		this.serialNo = serialNo;
		this.yearOfManufacture = yearOfManufacture;
		this.purchaseDate = purchaseDate;
		this.warrranty = warrranty;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public AssetCreation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVendorAssetTypeID() {
		return VendorAssetTypeID;
	}

	public void setVendorAssetTypeID(Integer vendorAssetTypeID) {
		VendorAssetTypeID = vendorAssetTypeID;
	}

	public VendorCreation getVendors() {
		return vendors;
	}

	public void setVendors(VendorCreation vendors) {
		this.vendors = vendors;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public AssetDefinition getAssetdef() {
		return assetdef;
	}

	public void setAssetdef(AssetDefinition assetdef) {
		this.assetdef = assetdef;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getWarrranty() {
		return warrranty;
	}

	public void setWarrranty(String warrranty) {
		this.warrranty = warrranty;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "AssetCreation [id=" + id + ", VendorAssetTypeID=" + VendorAssetTypeID + ", vendors=" + vendors
				+ ", make=" + make + ", modelId=" + modelId + ", assetdef=" + assetdef + ", isActive=" + isActive
				+ ", serialNo=" + serialNo + ", yearOfManufacture=" + yearOfManufacture + ", purchaseDate="
				+ purchaseDate + ", warrranty=" + warrranty + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
	

}