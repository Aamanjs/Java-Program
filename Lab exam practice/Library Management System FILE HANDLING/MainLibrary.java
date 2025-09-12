
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainLibrary {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		LibraryManagementSystem lms = new LibraryManagementSystem();
		
		FileOutputStream fo = new FileOutputStream("Books.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		while(true) {
			System.out.println("----------- Library Management System -----------");
			System.out.println(" 1. Add Book ");
			System.out.println(" 2. View Books ");
			System.out.println(" 3. Search Book By Title");
			System.out.println(" 4. Check Availability");
			System.out.println(" 5. Exit");
			
			int input = sc.nextInt();
			if(input == 5) {
				System.out.println("Exited from the system");
				break;
			}
			
			switch(input) {
			
			case 1: System.out.println("Enter Book Title to be added");
			String title = sc.next();
			
			System.out.println("Enter Author Name to be added");
			String name = sc.next();
			
			System.out.println("Enter ISBN to be added");
			String isbn = sc.next(); 
			
			System.out.println("Enter no of pages");
			int nop = sc.nextInt();
		
			
			Library l = new Library(title, name, isbn, nop, true);
			lms.addBook(l);
			break;
			
			case 2: lms.viewAllBooks();
			break;
			
			case 3: System.out.println("Enter book title");
			String title2 = sc.next();
			
			lms.searchByTitle(title2);
			break;
			
			case 4: System.out.println("Enter book title");
			String title1 = sc.next();
			
			lms.isBookAvailable(title1);
			break;
			
			
			
			
			
			}
			
		}
		
		
		
	}

}
