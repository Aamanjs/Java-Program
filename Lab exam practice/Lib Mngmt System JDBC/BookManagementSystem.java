
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BookManagementSystem {
	
	public static Connection gotConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","monu@123");
		return con;
	}
	
	//To add books
	public static void addBooks() throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Id to be added");
		int id = sc.nextInt();
		
		System.out.println("Enter Book Title Name to be added");
		String title = sc.next();
		
		System.out.println("Enter Author Name to be added");
		String author = sc.next(); 
		
		System.out.println("Enter Book is available or not");
		boolean isAvail = sc.nextBoolean();
		
		String qadd = "insert into Library values (?,?,?,?)";
		
		PreparedStatement pms = gotConnection().prepareStatement(qadd);
		pms.setInt(1,id);
		pms.setString(2, title);
		pms.setString(3, author);
		pms.setBoolean(4, isAvail);
		
		int no = pms.executeUpdate();
		
		System.out.println("Book Id"+ id + " added");
		 
	}
	
	
	//To view all books
	public static void viewAllBooks() throws ClassNotFoundException, SQLException {
		String query = "select * from Library";
		
		Statement smt = gotConnection().createStatement();
		
		ResultSet rs = smt.executeQuery(query);
		
		
		while(rs.next()) {
			System.out.println("BookId: " +rs.getInt(1)+ ", Title: " +rs.getString(2)+ ", Author: " +rs.getString(3)+ ", Is Available: " +rs.getString(4));
		}

	}
	
	
	//To update a book by BookId
	public static void updateBook(int idnumber) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Title Name to be updated");
		String title = sc.next();
		
		System.out.println("Enter Author Name to be updated");
		String author = sc.next(); 
		
		System.out.println("Enter Book is available or not");
		boolean isAvail = sc.nextBoolean();
		
		String qupd = "update Library set title = ?,author = ?, isAvailable = ? where bookId = ?" ;
		
		PreparedStatement pms = gotConnection().prepareStatement(qupd);
		
		int nol = 0;
		if(isAvail) {
			nol = 1;
		}

		pms.setString(1, title);
		pms.setString(2, author);
		pms.setInt(3, nol);
		pms.setInt(4, idnumber);
		
		int no = pms.executeUpdate();
		
		System.out.println("Book Id"+ idnumber +" updated");
				
	}
	
	
	//To delete
	public static void deleteBooks() throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Id to be deleted");
		int id = sc.nextInt();
		
		String qdel = "delete from Library where bookId = "+id;
		
		PreparedStatement pms = gotConnection().prepareStatement(qdel);
		
		int no = pms.executeUpdate();
		
		System.out.println("Book Id "+ id + " deleted");
		
	}
	
	//To search by author name
	public static void searchBooks(String name) throws ClassNotFoundException, SQLException {
		String query = "select * from Library";
		PreparedStatement pmt = gotConnection().prepareStatement(query);
		ResultSet rs = pmt.executeQuery();
		boolean bool = false;
		while(rs.next()) {
			if(rs.getString(3).equals(name)) {
				System.out.println("Book name: "+rs.getString(2));
				bool = true;
				break;
			}
		}
		if(bool==false) {
			System.out.println("Book not found");
		}

			
		
	}

}
