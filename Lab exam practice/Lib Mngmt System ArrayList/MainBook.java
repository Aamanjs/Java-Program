
import java.util.Scanner;

public class MainBook {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library l = new Library();
		
		while(true) {
			
			System.out.println("----------- Library Management System -----------");
			System.out.println(" 1. Add Book ");
			System.out.println(" 2. View Books ");
			System.out.println(" 3. Search Book by Title name");
			System.out.println(" 4. Borrow Book");
			System.out.println(" 5. Return Book ");
			System.out.println(" 6. Check book availability");
			System.out.println(" 7. Exit ");
			
			int input = sc.nextInt();
			if(input == 7) {
				System.out.println("Exited from the system");
				break;
			}
			
			switch(input) {
			
			case 1: System.out.println("Enter Book Title Name to be added");
			String title = sc.next();
			
			System.out.println("Enter Author Name to be added");
			String author = sc.next(); 
			
			System.out.println("Enter ISBN number to be added");
			String ISBN = sc.next(); 
			
			System.out.println("Enter Number of pages to be added");
			int nop = sc.nextInt(); 
			
			System.out.println("Enter Book is available or not");
			boolean isAvail = sc.nextBoolean();
			
			Book book = new Book(title, author, ISBN, nop, isAvail);
			
			l.addBook(book);
			
			System.out.println("Book " +title+ " added succesfully" );
			
			
			break;
			
			case 2: l.viewAllBooks();
			break;
				
			case 3: l.searchByTitle();	
			break;
				
			case 4: System.out.println("Enter Book Title to be borrowed");
			String btitle = sc.next();
			l.borrowBook(btitle);
			break;
				
			case 5: System.out.println("Enter Book Title to be returned");
			String rtitle = sc.next();
			l.returnBook(rtitle);	
			break;
				
			case 6: System.out.println("Enter Book Title to check availability");
			String ctitle = sc.next();
			l.isBookAvailable(ctitle);	
			break;
				
			default: System.err.println("Invalid Input!!");
			
			}
			
		}
		
	}

}
