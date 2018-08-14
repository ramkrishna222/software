package com.rs.hibernate.core.example;

import java.io.Serializable;

public class Product implements Serializable{
	
	private int productId;
	private String proName;
	private Double price;
	//private int version;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	/*public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}*/

}
