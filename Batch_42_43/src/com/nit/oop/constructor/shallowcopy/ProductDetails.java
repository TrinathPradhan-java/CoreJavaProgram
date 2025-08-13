package com.nit.oop.constructor.shallowcopy;

public class ProductDetails {
	public static void main(String [] args) {
		//create a Product object with product reference
		Product product=new Product(101,"james",6500.500);
		System.out.println(product);
		//create a new product object
		Product p2=product;
		System.out.println(p2);
		//reintialized the object.
		p2.setPrice(30000);
		p2.setProduct(100);
		p2.setProductName("Laptop");
		
		System.out.println("After updated");//after reinitialize the object the object properties will changed .
		System.out.println(p2);
		System.out.println(product);
	}

}
