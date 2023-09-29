package com.enigma.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AssetDefinition")
public class AssetDefinition {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="assetType",nullable=false,length=60)
	private String assetType;
	
	@Column(name="make",nullable=false,length=60)
	private String make;
	
	@Column(name="model",nullable=false,length=60)
	private String model;

	
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

	public AssetDefinition(Integer id, String assetType, String make, String model, String serialNo,
			String yearOfManufacture, Date purchaseDate, String warrranty, Date fromDate, Date toDate) {
		super();
		this.id = id;
		this.assetType = assetType;
		this.make = make;
		this.model = model;
		this.serialNo = serialNo;
		this.yearOfManufacture = yearOfManufacture;
		this.purchaseDate = purchaseDate;
		this.warrranty = warrranty;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public AssetDefinition() {
		super();
	}

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

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
		return "AssetDefinition [id=" + id + ", assetType=" + assetType + ", make=" + make + ", model=" + model
				+ ", serialNo=" + serialNo + ", yearOfManufacture=" + yearOfManufacture + ", purchaseDate="
				+ purchaseDate + ", warrranty=" + warrranty + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
	


}
