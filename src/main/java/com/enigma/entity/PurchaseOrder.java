package com.enigma.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PurchaseOrder")
public class PurchaseOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer id;
	
	@Column(name="PurchaseOrderNo")
	private String purchaseOrderNo ;
	
	@Column(name="AssetType")
	private String assetType;
	
	@Column(name="VendorName")
	private String vendorName;
	
	@Column(name="OrderDate")
	private Date orderDate;
	
	@Column(name="DeliveryDate")
	private Date deliveryDate;
	
	//Mapping
	@Column(name="StatusId")
	private Integer statusId;
	@OneToOne
	@JoinColumn(name="statusId",insertable=false,updatable=false)
	private Status status;

	public PurchaseOrder(Integer id, String number, String assetType, String vendorName, Date orderDate,
			Date deliveryDate, Integer status) {
		super();
		this.id = id;
		this.purchaseOrderNo = number;
		this.assetType = assetType;
		this.vendorName = vendorName;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.statusId = status;
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

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
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
				+ ", vendorName=" + vendorName + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", statusId=" + statusId + ", status=" + status + ", getId()=" + getId() + ", getNumber()="
				+ getNumber() + ", getAssetType()=" + getAssetType() + ", getVendorName()=" + getVendorName()
				+ ", getOrderDate()=" + getOrderDate() + ", getDeliveryDate()=" + getDeliveryDate() + ", getStatusId()="
				+ getStatusId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	

}
