package com.enigma.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PurchaseOrder")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;

	@Column(name = "PurchaseOrderNo")
	private String purchaseOrderNo;

	
	@ManyToOne
    @JoinColumn(name = "assetTypeId", nullable = false, updatable = false)
    private AssetType assetType;
	
	
	@Column(name="AssetId")
	private int assetId;
	@OneToOne
	@JoinColumn(name="assetId",insertable=false,updatable=false)
	private AssetDefinition assetdefinition;

	@Column(name = "VendorId")
	//Mapping to Vendor Creation
	private Integer vendorId;
	@OneToOne
	@JoinColumn(name = "vendorId", insertable = false,updatable = false)
	private VendorCreation vendorCreation;

	@Column(name = "OrderDate")
	private Date orderDate;

	@Column(name = "DeliveryDate")
	private Date deliveryDate;

	// Mapping to Status table
	@Column(name = "StatusId")
	private Integer statusId;
	@OneToOne
	@JoinColumn(name = "statusId", insertable = false, updatable = false)
	private Status status;


	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public AssetDefinition getAssetdefinition() {
		return assetdefinition;
	}

	public void setAssetdefinition(AssetDefinition assetdefinition) {
		this.assetdefinition = assetdefinition;
	}


	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	

	public PurchaseOrder(Integer id, String purchaseOrderNo, AssetType assetType, int assetId,
			AssetDefinition assetdefinition, Integer vendorId, VendorCreation vendorCreation, Date orderDate,
			Date deliveryDate, Integer statusId, Status status) {
		super();
		this.id = id;
		this.purchaseOrderNo = purchaseOrderNo;
		this.assetType = assetType;
		this.assetId = assetId;
		this.assetdefinition = assetdefinition;
		this.vendorId = vendorId;
		this.vendorCreation = vendorCreation;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.statusId = statusId;
		this.status = status;
	}

	public String getPurchaseOrderNo() {
		return purchaseOrderNo;
	}

	public void setPurchaseOrderNo(String purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}



	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public VendorCreation getVendorCreation() {
		return vendorCreation;
	}

	public void setVendorCreation(VendorCreation vendorCreation) {
		this.vendorCreation = vendorCreation;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public PurchaseOrder() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return purchaseOrderNo;
	}

	public void setNumber(String number) {
		this.purchaseOrderNo = number;
	}



	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer status) {
		this.statusId = status;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [id=" + id + ", purchaseOrderNo=" + purchaseOrderNo + ", assetType=" + assetType
				+ ", assetId=" + assetId + ", assetdefinition=" + assetdefinition + ", vendorId=" + vendorId
				+ ", vendorCreation=" + vendorCreation + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", statusId=" + statusId + ", status=" + status + ", getAssetId()=" + getAssetId()
				+ ", getAssetdefinition()=" + getAssetdefinition() + ", getPurchaseOrderNo()=" + getPurchaseOrderNo()
				+ ", getVendorId()=" + getVendorId() + ", getVendorCreation()=" + getVendorCreation() + ", getStatus()="
				+ getStatus() + ", getId()=" + getId() + ", getNumber()=" + getNumber() + ", getOrderDate()="
				+ getOrderDate() + ", getDeliveryDate()=" + getDeliveryDate() + ", getStatusId()=" + getStatusId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	


}
