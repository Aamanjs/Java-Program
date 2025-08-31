package shoppingCart;

import java.util.Scanner;

public class CartManager {

    public Product[] createproduct()
    {
        Product[] p = new Product[2];
        Scanner s = new Scanner(System.in);

        for(int i=0; i<p.length; i++)
        {
        	System.out.println("Enter productId, productName, price, quantity for Product " + (i + 1) + ":");
            p[i] = new Product(s.nextInt(), s.next(), s.nextInt(), s.nextInt());
        }
        return p;
    
    }
    
    public Product addProduct()
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter new productId, productName, price, quantity:");
    	return new Product(s.nextInt(), s.next(), s.nextInt(), s.nextInt());
    }
    
    public Product updateProduct(Product[] products)
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter productId to update:");
    	int id = s.nextInt();
    	
    	boolean found = false;
    	for(Product p: products) {
    		if(p.productid == id) {
    			found = true;
    			System.out.println("What do you want to update? (1: Price, 2: Quantity)");
    			int choice = s.nextInt();
    			if (choice == 1) {
    				System.out.println("Enter new price:");
    				p.price = s.nextInt();
    				System.out.println("Price updated successfully!");
    			} else if (choice == 2) {
    				System.out.println("Enter new quantity:");
    				p.quantity = s.nextInt();
    				System.out.println("Quantity updated succeasfully");
    			} else {
    				System.out.println("Invalid choice!");
    			}
    			return p;
    		}
    	}
    	
    	System.out.println("Product with ID " + id + " not found!");
    	return null;
    }
    
//    public Product deleteProducts(Product[] products)
//    {
//    	Scanner s = new Scanner(System.in);
//    	System.out.println("Enter productId to update:");
//    	int id = s.nextInt();
//    	
//    	for(Product p: products) {
//    		if(p.productid == id) {
//    			p[i] -= p[i].productid;
//    		}
//    		
//    	}
//
//    	
//    }
//    
    
    public int getTotalBill(Product[] products) {
    	int totalBill = 0;
    	for (Product p : products)
    	{
    		totalBill += p.price * p.quantity;
    	}
    	
    	return totalBill;
    }
    
    void viewProduct(Product[] p)
    {
    	for(int i=0; i<p.length; i++)
        {
            p[i].viewProduct();     
        }
    }
        
    
}

