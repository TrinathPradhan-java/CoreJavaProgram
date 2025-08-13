package com.nit.lab.abstract02_april;

public class PhysicalProduct extends Product 
{
private double shippingWeight;

public PhysicalProduct(String name,double price,String catagory,double shippingWeight)
{
	super(name,price,catagory);
	this.shippingWeight=shippingWeight;

}

public void applyDiscount(double percentage)
{
	double discount = super.getPrice()*percentage/100;
	setPrice(getPrice()-discount);
	System.out.println("discount "+discount);
	System.out.println("newPrice "+getPrice());
}





@Override
public double calculateTax() {

	return (getPrice()*0.08);
}
public double calculateShippingCost(){
	{
		return (double)shippingWeight*5;
	}
}
@Override
public String toString() {
	return "PhysicalProduct ["+super.toString()+"shippingWeighjt=" + shippingWeight + "]";
}

}
