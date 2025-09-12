

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainProduct {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner sc =  new Scanner(System.in);
		ProductManagementSystem pm = new ProductManagementSystem();
		
		FileOutputStream fo = new FileOutputStream("Products.dat");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		
		
		while(true) {
			
			System.out.println("--------- Product Management System ---------");
			System.out.println(" 1. Add Product ");
			System.out.println(" 2. View Product ");
			System.out.println(" 3. Calculate Total Inventory Value");
			System.out.println(" 4. Exit");
		
			int input = sc.nextInt();
			if(input == 4) {
				System.out.println("Exited from the system");
				break;
			}
			
			switch(input) {
			
			case 1 : System.out.println("Enter Product Id to be added");
			int id = sc.nextInt();
			
			System.out.println("Enter Product Name to be added");
			String name = sc.next();
			
			System.out.println("Enter Price to be added");
			int price = sc.nextInt(); 
			
			System.out.println("Enter Quantity to be added");
			int quantity = sc.nextInt();
			
			Product p = new Product(id, name, price, quantity);
			pm.addProduct(p);
			break;
			
			case 2 : pm.viewProduct();
			break;
			
			case 3 : System.out.println(pm.calculateTotalInventoryValue()+" rupees");
			break;
			
			
			}
		
		}
		
	}

}
