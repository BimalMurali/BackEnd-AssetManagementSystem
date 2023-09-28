package com.nissan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PurchaseOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer id;
	
	@Column(name="Purchase_order_no")
	private String number;
	
	@Column(name="Asset_Type")
	private String assetType;
	
	@Column(name="Vendor_Name")
	private String vendorName;
	
	@Column(name="Order Date")
	private Date orderDate;
	
	@Column(name="Delivery_Date")
	private Date deliveryDate;
	
	@Column(name="Status")
	private String status;

	public PurchaseOrder(Integer id, String number, String assetType, String vendorName, Date orderDate,
			Date deliveryDate, String status) {
		super();
		this.id = id;
		this.number = number;
		this.assetType = assetType;
		this.vendorName = vendorName;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
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
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	

}
