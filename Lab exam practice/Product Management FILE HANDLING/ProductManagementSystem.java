package pr1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductManagementSystem {

	ArrayList<Product> productList = new ArrayList<>();

	// To add Product
	public void addProduct(Product p) throws IOException {

		FileOutputStream fo1 = new FileOutputStream("Products.dat");
		ObjectOutputStream oo1 = new ObjectOutputStream(fo1);

		productList.add(p);
		for (Product p1 : productList) {
			oo1.writeObject(p1);
		}

		System.out.println("Product added succesfully");

	}

	// To view Product
	public void viewProduct() throws IOException, ClassNotFoundException {

		FileInputStream fi = new FileInputStream("Products.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);

		Product pk;
		try {
			while ((pk= (Product) oi.readObject())!=null) {
				pk.displayProductDetails();
			}
		} catch (EOFException E) {
			// TODO: handle exception
		}

	}

	//To cal total inventory value
	public int calculateTotalInventoryValue() throws IOException, ClassNotFoundException {
		
		FileInputStream fi = new FileInputStream("Products.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);

		int amount = 0;
		Product pk;
		try {
			while ((pk= (Product) oi.readObject())!=null) {
				amount += pk.getPrice() * pk.getQuantity();
			} 
		} catch (EOFException E) {
			// TODO: handle exception
		}
		
		return amount;
		
		
	}

}
