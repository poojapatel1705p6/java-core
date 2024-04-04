package com.learning.core.day1session1;

public class D01P01 {
    public class Book{
  	  String book_title;
  	  double book_price;
 //Constructor 	  
 public Book(String book_title,double book_price){
            this.book_title = book_title;
            this.book_price = book_price;
  	  } 
 //Getter book_title 
 public String getBook_title() {
            return book_title;
 }  
 //Setter book_title  
 public void setBook_title(String book_title) {
                this.book_title = book_title;
       }
 //Getter book_price
 public double getBook_price() {
     return book_price;
 }
 //Setter  book_price
 public void setBook_price(double book_price) {
     this.book_price = book_price;
 }
    }
  //createbook method  
  public Book createBooks(String book_title, double book_price){
          return new Book(book_title, book_price);
  }  
 //showbooks method 
  public void showBooks(Book book) {
      System.out.println("Book Title: " + book.getBook_title() + " and Price: " + book.getBook_price());
      }  
	public static void main(String[] args) {
		D01P01 program = new D01P01();
      // Creating a book instance
      Book myBook = program.createBooks("Java Programming", 350.00);
      // Showing book details
      program.showBooks(myBook);	
	}
}
