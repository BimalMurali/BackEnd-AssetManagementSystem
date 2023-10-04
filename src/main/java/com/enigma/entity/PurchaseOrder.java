package com.enigma.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PurchaseOrder")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;


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
	private LocalDate orderDate;

	@Column(name = "DeliveryDate")
	private LocalDate deliveryDate;

	// Mapping to Status table
	@Column(name = "StatusId")
	private Integer statusId;
	@OneToOne
	@JoinColumn(name = "statusId", insertable = false, updatable = false)
	private Status status;
	
	@Column(name="isActive")
	private boolean isActive=true;


	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

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




	public PurchaseOrder(Integer id, int assetId, AssetDefinition assetdefinition, Integer vendorId,
			VendorCreation vendorCreation, LocalDate orderDate, LocalDate deliveryDate, Integer statusId, Status status,
			boolean isActive) {
		super();
		this.id = id;
		this.assetId = assetId;
		this.assetdefinition = assetdefinition;
		this.vendorId = vendorId;
		this.vendorCreation = vendorCreation;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.statusId = statusId;
		this.status = status;
		this.isActive = isActive;
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





	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
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
		return "PurchaseOrder [id=" + id + ", assetId=" + assetId + ", assetdefinition=" + assetdefinition
				+ ", vendorId=" + vendorId + ", vendorCreation=" + vendorCreation + ", orderDate=" + orderDate
				+ ", deliveryDate=" + deliveryDate + ", statusId=" + statusId + ", status=" + status + ", isActive="
				+ isActive + ", isActive()=" + isActive() + ", getAssetId()=" + getAssetId() + ", getAssetdefinition()="
				+ getAssetdefinition() + ", getVendorId()=" + getVendorId() + ", getVendorCreation()="
				+ getVendorCreation() + ", getStatus()=" + getStatus() + ", getId()=" + getId() + ", getOrderDate()="
				+ getOrderDate() + ", getDeliveryDate()=" + getDeliveryDate() + ", getStatusId()=" + getStatusId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}
