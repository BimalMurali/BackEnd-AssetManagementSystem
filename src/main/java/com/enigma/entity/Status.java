package com.enigma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StatusId")
	private Integer statusId;
	
	@Column(name="StatusNames")
	private String statusNames;
	
	

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Status(Integer statusId, String statusNames) {
		super();
		this.statusId = statusId;
		this.statusNames = statusNames;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusNames() {
		return statusNames;
	}

	public void setStatusNames(String statusNames) {
		this.statusNames = statusNames;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusNames=" + statusNames + ", getStatusId()=" + getStatusId()
				+ ", getStatusNames()=" + getStatusNames() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
