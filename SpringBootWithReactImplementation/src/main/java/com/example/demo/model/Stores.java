package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
public class Stores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String storeName;
	private String emailId;
	private String mobileNumber;
	
	public Stores() {
		//default Constructor
	}
	
	public Stores(String storeName, String emailId, String mobileNumber) {
		super();
		this.storeName = storeName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	

}
