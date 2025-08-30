
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
    
    void displayProduct(Product[] p)
    {
    	for(int i=0; i<p.length; i++)
        {
            p[i].displayProduct();     
            System.out.println("Total products created: " + Product.productCount); 
        }
    }
        
    
}
