
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	ArrayList<Book> ba = new ArrayList<>();
	
	
	//To add product
	public void addBook(Book book) {
		
		ba.add(book);
		
	}
	
	
	//To view Product
	public void viewAllBooks() {
		
		if(ba.isEmpty()) {
			System.out.println("No products to display");
		} else {
			
			for(Book books : ba) {
				books.displayBook();
			}
		}
		
	}
	
	
	//To search book by title name
	public void searchByTitle() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Title");
		String ititle = sc.next();
		
		boolean bool = false;
		for(Book books : ba) {
			if(books.title.equals(ititle)) {
				bool = true;
				System.out.println(ititle+ " is available in list");
				books.displayBook();
			}
		}
		
		if(bool == false) {
			System.out.println(ititle+ " is not available in list");
		}

	}
	
	
	//To Borrow Book
	public void borrowBook(String title) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean bool1 = false;
		for (Book books : ba) {
			if(books.title.equals(title)) {
				bool1 = true;
				if(books.isAvailable == true) {
					System.out.println("Book "+title+ " is available");
					System.out.println("Does student want to borrow book? (Yes/No)");
					String input = sc.next().toLowerCase();
					switch(input) {
					case "yes": 
						books.isAvailable = false;
						System.out.println("The book "+title+ " has been borrowed ");
					break;
					case "no":
						books.isAvailable = true;
					break;
					default : System.out.println("Invalid Input!!");
					}
				} else if(books.isAvailable == false){
					System.out.println("Book "+title+" is not available in list, it has been already borrowed");
				}
			} 
		}
		
		if(bool1 == false) {
			System.out.println("Book "+title+ " is not available in system");
		}
	}
	
	
	//To return book
	public void returnBook(String title) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean bool1 = false;
		for (Book books : ba) {
			if(books.title.equals(title)) {
				bool1 = true;
				if(books.isAvailable == false) {
					System.out.println("Book "+title+ " is borrowed by Student");
					System.out.println("Does Student want to Return Book? (Yes/No)");
					String input = sc.next().toLowerCase();
					switch(input) {
					case "yes": 
						books.isAvailable = true;
						System.out.println("The book "+title+ " has been returned ");
					break;
					case "no":
						books.isAvailable = false;
					break;
					default : System.out.println("Invalid Input!!");
					}
				} else if(books.isAvailable == true) {
					System.out.println("Book "+title+ " is available in list, could not be Returned");
				}
			}
		}
		if(bool1 == false) {
			System.out.println("Book "+title+ " is available in system could be Returned");
		}
	}
	
	
	//To check availability of book
	public void isBookAvailable(String title) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean bool1 = false;
		for (Book books : ba) {
			if(books.title.equals(title)) {
				bool1 = true;
				if(books.isAvailable == true) {
					System.out.println("Book "+title+ " is available in list");
				} else if(books.isAvailable == false) {
					System.out.println("Book "+title+ " is not available in list");
				}
			}
		}
		if(bool1 == false) {
			System.out.println("Book "+title+ " is not available in system");
		}
	}
	
	
}
