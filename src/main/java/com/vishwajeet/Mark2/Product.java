package com.vishwajeet.Mark2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	@Value("123456789")
	private int productId;
	@Value("Redmi Phone")
	private String productName;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product Details are :\n\n[productId = " + productId + ", productName = " + productName + "]";
	}
	
	

}
