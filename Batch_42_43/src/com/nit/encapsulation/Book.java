package com.nit.encapsulation;

public class Book {
	//Instance variable or static field with data hiding concept.
private String author;
private String name;
private double price;
//create user defined costumer.
public Book(String author,String name,double price) {
this.author=author;
this.name = name;
this.price = price; 
}
//to print object properties.
public String toString() {
	return "Book[Book author "+author+" Book name is "+name+ "price is :" +price+"]";
}
//create a static method with return type class. 
public static Book m1() {
	Book b1 = new Book("James Gosling","java",35000);
	return b1;
}
}
