
package shoppingCart;

public class Main {

    public static void main(String[] args) {
        CartManager cm = new CartManager();
        
        Product[] p = cm.createproduct();
        
        cm.viewProduct(p);
        System.out.println("Total products created: " + Product.productCount); 
        
        Product newProduct = cm.addProduct();
        
        Product[] up = new Product[p.length + 1];
        for( int i = 0; i<p.length; i++)
        {
        	up[i] = p[i];
        }
        
        up[p.length] = newProduct;
        
        cm.updateProduct(up);
        System.out.println("\n--- Updated Product List ---");
        
        cm.viewProduct(up);
        System.out.println("Total products created: " + Product.productCount);
        
        System.out.println("\nTotal Bill: " + cm.getTotalBill(up)); 
        	
    }
    
}
