package com.enigma.entity;
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
	private Date validFrom;
	
	@Column(name="validto",nullable=false,length=60)
	private Date validTo;
	
	@Column(name="address",nullable=false,length=60)
	private String address;
	
	

	
	public VendorCreation() {
		
	}
	
	
	public VendorCreation(Integer id, String vendorName, String type, Integer assettypeid, AssetType assetType,
			Date validFrom, Date validTo, String address) {
		super();
		this.id = id;
		this.vendorName = vendorName;
		this.type = type;
		this.assettypeid = assettypeid;
		this.assetType = assetType;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.address = address;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "VendorCreation [id=" + id + ", vendorName=" + vendorName + ", type=" + type + ", assettypeid="
				+ assettypeid + ", assetType=" + assetType + ", validFrom=" + validFrom + ", validTo=" + validTo
				+ ", address=" + address + "]";
	}	
	
}
