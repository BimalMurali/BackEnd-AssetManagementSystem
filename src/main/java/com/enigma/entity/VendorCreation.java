package com.enigma.entity;
import java.time.LocalDate;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="vendors")
public class VendorCreation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="vendorname",nullable=false,length=60)
	private String vendorName;
	
	@Column(name="type",nullable=false,length=60)
	private String type;
	
	@Column(name="assettypeid")
	private Integer assettypeid;
	@ManyToOne
	@JoinColumn(name="assettypeid",insertable=false,updatable=false)
	private AssetType assetType;
	
	@Column(name="validfrom",nullable=false,length=60)
	private LocalDate validFrom;
	
	@Column(name="validto",nullable=false,length=60)
	private LocalDate validTo;
	
	@Column(name="address",nullable=false,length=60)
	private String address;
	
	private boolean isActive=true;
	
	

	
	public VendorCreation() {
		
	}
	
	
	public VendorCreation(Integer id, String vendorName, String type, Integer assettypeid, AssetType assetType,
			LocalDate validFrom, LocalDate validTo, String address, boolean isActive) {
		super();
		this.id = id;
		this.vendorName = vendorName;
		this.type = type;
		this.assettypeid = assettypeid;
		this.assetType = assetType;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.address = address;
		this.isActive = isActive;
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


	public Integer getAssettypeid() {
		return assettypeid;
	}


	public void setAssettypeid(Integer assettypeid) {
		this.assettypeid = assettypeid;
	}


	public AssetType getAssetType() {
		return assetType;
	}


	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}


	public LocalDate getValidFrom() {
		return validFrom;
	}


	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}


	public LocalDate getValidTo() {
		return validTo;
	}


	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "VendorCreation [id=" + id + ", vendorName=" + vendorName + ", type=" + type + ", assettypeid="
				+ assettypeid + ", assetType=" + assetType + ", validFrom=" + validFrom + ", validTo=" + validTo
				+ ", address=" + address + ", isActive=" + isActive + "]";
	}


	
	
}
