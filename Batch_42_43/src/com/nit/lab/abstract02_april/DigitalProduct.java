package com.nit.lab.abstract02_april;

public class DigitalProduct extends Product

{
private String licenceKey;

public DigitalProduct(String name,double price,String catagory,String licenceKey)
{
	super(name,price,catagory);
	this.licenceKey=licenceKey;

}
@Override
public void applyDiscount(double percentage)
{
	double discount = super.getPrice()*percentage/100;
	setPrice(getPrice()-discount);
	System.out.println("discount "+discount);
	System.out.println("newPrice "+getPrice());
	
}

@Override
public double calculateTax()
{
	
	return (getPrice()*0.05);
}
@Override
public String toString() {
	return "DigitalProduct [ " +super.toString()+"licenceKey=" + licenceKey + "]";
}





}
