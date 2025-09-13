
import java.sql.SQLException;
import java.util.Scanner;

public class MainBook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("----------- Library Management System -----------");
			System.out.println(" 1. Add Book ");
			System.out.println(" 2. View Books ");
			System.out.println(" 3. Update Book By BookId");
			System.out.println(" 4. Remove Book");
			System.out.println(" 5. Search Book by Author name");
			System.out.println(" 6. Exit");
			
			int input = sc.nextInt();
			if(input == 6) {
				System.out.println("Exited from the system");
				break;
			}
			
			switch(input) {
			case 1: BookManagementSystem.addBooks();
			break;
				
			case 2: BookManagementSystem.viewAllBooks();
			break;
			
			case 3: System.out.println("Enter Book Id to be updated");
			int uid = sc.nextInt();
			BookManagementSystem.updateBook(uid);
			
			case 4: BookManagementSystem.deleteBooks();
			break;
			
			case 5: System.out.println("Enter the author name to be searched");
			String author = sc.next();
			BookManagementSystem.searchBooks(author);
				
			break;
			
			default: System.out.println("Invalid input!!");
			
			}
			
			
		}
	}
}
