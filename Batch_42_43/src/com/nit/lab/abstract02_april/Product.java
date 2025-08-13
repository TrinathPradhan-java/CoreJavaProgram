package com.nit.lab.abstract02_april;

public abstract class Product 
{
private String name;
private double price;
private String catagory;


public Product(String name,double price,String catagory)
{
	this.name=name;
	this.price=price;
	this.catagory=catagory;
}
public abstract void applyDiscount(double percentage);
public abstract double calculateTax();


public void setPrice(double price)
{
	this.price = price;
}
public double getPrice()
{
	return price;
}
@Override
public String toString() {
	return "Product [name=" + name + ", \n  price=" + price + ",\n catagory=" + catagory + "]";
}


}
