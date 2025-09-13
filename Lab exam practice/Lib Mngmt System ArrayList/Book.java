
public class Book {
	
	 String title;
	 String author;
	 String ISBN;
	 int numberOfPages;
	 boolean isAvailable;
	 
	 public Book(String title, String author, String iSBN, int numberOfPages, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.numberOfPages = numberOfPages;
		this.isAvailable = isAvailable;
	 }
	 
	 public void displayBook() {
		 System.out.println("Title: " +title+ ", Author: " +author+ ", ISBN: " +ISBN+ ", No of Pages" +numberOfPages+ ", Is Available" +isAvailable);
	 }
	 

}
