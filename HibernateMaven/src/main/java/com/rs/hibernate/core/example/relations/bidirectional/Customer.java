package com.rs.hibernate.core.example.relations.bidirectional;

public class Customer {

	private int customerId;
	private String customerName;
	private Vendor parentObjects;
	private int vendorId;
	
	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

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

	public Vendor getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Vendor parentObjects) {
		this.parentObjects = parentObjects;
	}

}
