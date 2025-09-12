
import java.io.Serializable;

public class Library implements Serializable {
	
	 String title;
	 String author;
	 String ISBN;
	 int numberOfPages;
	 boolean isAvailable;
	 
	 Library()
	 {
		 title = "Empty";
		 author = "Empty";
		 ISBN = "Empty";
		 numberOfPages = 0;
		 isAvailable = true;
	 }

	 public Library(String title, String author, String iSBN, int numberOfPages, boolean isAvailable) 
	 {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.numberOfPages = numberOfPages;
		this.isAvailable = isAvailable;
	 }
	 
	 public void displayBook() {
		 System.out.println("Title: " +title+ ", Author: " +author+ ", ISBN: " +ISBN+ ", No of Pages" +numberOfPages+ ", Is Available" +isAvailable);
	 }
	 
	 
	 
}
