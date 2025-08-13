package com.nit.encapsulation;

public class BookDetails {

	public static void main(String[] args) {
		//In the above program, m1() method returns the Book object but as we know a method is mainly used for
		//reusability purpose but here we are receiving only object.
		Book book = Book.m1();
		System.out.println(book);

	}

}
