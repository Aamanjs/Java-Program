

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LibraryManagementSystem {
	
	ArrayList<Library> bookList = new ArrayList<>();
	
	//To add Books
	public void addBook(Library l) throws IOException {
		
		FileOutputStream fo = new FileOutputStream("Books.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		bookList.add(l);
		for(Library l1 : bookList) {
			oo.writeObject(l1);
		}
		
		System.out.println("Books added sucessfully");
		
	}
	
	//To view all Books
	public void viewAllBooks() throws IOException, ClassNotFoundException {
		
		FileInputStream fi = new FileInputStream("Books.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Library bk;
		try {
			while((bk = (Library) oi.readObject()) != null) {
				bk.displayBook();
			}
		} catch (EOFException E) {
			// TODO: handle exception
		}
		
	}
	
	//To search book by title
	public void searchByTitle(String title) throws IOException, ClassNotFoundException {
		
		FileInputStream fi = new FileInputStream("Books.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Library bk;
		boolean bool = false;
		try {
			while ((bk = (Library) oi.readObject()) != null) {
				if(bk.title.equals(title)){
					bk.displayBook();
					bool = true;
					break;
				}
			}

			//System.out.println("Book is not available");
		} catch (EOFException E) {
			// TODO: handle exception
		}
		//do the outssidde while operation ouside of the try & catch
		if(bool==false) {
			System.out.println("Book is not available");
		}
		
		
	}
	
	//To check availability
	public void isBookAvailable(String title) throws IOException, ClassNotFoundException {
		
		FileInputStream fi = new FileInputStream("Books.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Library bk;
		try {
			while((bk = (Library) oi.readObject()) != null) {
				if(bk.title.equals(title)) {
					System.out.println("Book is available");
				} else System.out.println("Book is not available");
			}
		} catch (EOFException E) {
			// TODO: handle exception
		}
		
	}
	

}

