package com.nit.lab.oop2;
import java.util.*;

public class Product {

	int productID ;
	String productName;
	double productPrice;
	
public void setProductData() {
	Scanner sc = new Scanner(System.in); 
	System.out.print("eNTER pRODUCT ID : ");
	productID = sc.nextInt();
	System.out.print("eNTER pRODUCT nAME : ");
	productName = sc.nextLine();
	productName = sc.nextLine();
	System.out.print("eNTER pRODUCT pRICE : ");
	productPrice = sc.nextDouble();
	
	
	
}

public void getProduct() {
	System.out.println("--------------------------------------");
		System.out.println("After printing product is");
		System.out.println("---------------------------------");

	System.out.println("Print product ID : "+productID);
	System.out.println("Print product Name : "+productName);
	System.out.println("Print product price : "+productPrice);
	
	System.out.println("--------------------------------------");}



	
}


