package com.learning.core.day1session1;

public class D01P01 {
	public static Book createBooks(String booktitle,Double price) {
		Book b1 = new Book();
		b1.setBooktitle(booktitle);
		b1.setprice(price);
		
		return b1;

	}
	public static void ShowBooks(Book book) {
		System.out.println("Book Title: " +book.getBooktitle()+ " and price " +book.getprice());
		
	}
	public static void main(String[] args) {
		Book b2=createBooks("java Programming",350.00);
		ShowBooks(b2);
	}


}
