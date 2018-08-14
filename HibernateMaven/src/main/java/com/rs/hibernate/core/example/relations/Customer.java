package com.rs.hibernate.core.example.relations;

public class Customer {
	
	private int customerId;
	private String customerName;
	private  int vendorId;

	public int getCustomerId() {
	return customerId;
	}
	public void setCustomerId(int customerId) {
	this.customerId = customerId;
	}
	public String getCustomerName() {
	return customerName;
	}
	public void setCustomerName(String customerName) {
	this.customerName = customerName;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	

	}
