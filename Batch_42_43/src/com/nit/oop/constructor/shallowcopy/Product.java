package com.nit.oop.constructor.shallowcopy;

public class Product {
	private int productId;
	private String productName;
	private double price;
	//create a user defined constructor. 
	public Product(int productId , String productName,double price) {
		this.productId=productId;
		
		this.productName=productName;
		
		 this.price=price;
	}
	//create input method and write settor method. 
	public void setProduct(int productId) {
		this.productId= productId;
	}
	//create read method used getter method.
	public int getProduct() {
		return this.productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

	
	
}
