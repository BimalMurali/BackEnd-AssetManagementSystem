package com.nissan.entity;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


public class VendorCreation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="vendorname",nullable=false,length=60)
	private String vendorName;
	
	@Column(name="type",nullable=false,length=60)
	private String type;
	
	@Column(name="assettype",nullable=false,length=60)
	private String assetType;
	
	@Column(name="validfrom",nullable=false,length=60)
	private Date validFrom;
	
	@Column(name="validto",nullable=false,length=60)
	private Date validTo;
	
	public VendorCreation() {
		
	}
	
	public VendorCreation(Integer id, String vendorName, String type, String assetType, Date validFrom, Date validTo) {
		super();
		this.id = id;
		this.vendorName = vendorName;
		this.type = type;
		this.assetType = assetType;
		this.validFrom = validFrom;
		this.validTo = validTo;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	@Override
	public String toString() {
		return "VendorCreation [id=" + id + ", vendorName=" + vendorName + ", type=" + type + ", assetType=" + assetType
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + "]";
	}

	
	
}
