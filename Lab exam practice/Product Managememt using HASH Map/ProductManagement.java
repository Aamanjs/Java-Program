
import java.util.HashMap;
import java.util.Scanner;

public class ProductManagement {
	
	Scanner sc = new Scanner(System.in);
	
	HashMap<Integer, Product> ph = new HashMap<>();
	
	//Add Product
	public void addProduct(Product product) {
		if(ph.containsKey(product.getProductId())) {
			System.out.println("Product ID already exists");
		} else  {
			ph.put(product.getProductId(), product);
			System.out.println("Product added succesfully");
		}
	}
	
	//View Product
	public void viewAllProducts() {
		if(ph.isEmpty()) {
			System.out.println("No product available.");
		} else {
			System.out.println("Product List: ");
			for (Product p : ph.values()) {
				p.displayProductDetails();
			}
		}
	}
	
	//Update Product
	public void updateProduct(int productId) {
		if(ph.containsKey(productId)) {
			Product p = ph.get(productId);
			
			System.out.println("Enter new name");
			String name = sc.nextLine();
			
			System.out.println("Enter new price");
			double price = sc.nextDouble();
			
			System.out.println("Enter new Quantity");
			int qty = sc.nextInt();
			
			p.setProductName(name);
			p.setPrice(price);
			p.setQuantity(qty);
			
			System.out.println("Product Updated Succesfully");
			
		} else {
			System.out.println("Product not found");
		}
	}
	
	//Delete Product
	public void deleteProduct(int productId) {
		if(ph.remove(productId) != null) {
			System.out.println("Product "+productId+" deleted succesfully.");
		} else {
			System.out.println("Product id not found.");
		}
	}	
		
	//calculate total inventory value	
	public void calculateTotalInventoryValue() {
		double totalValue = 0;
		for(Product p : ph.values()) {
			totalValue += p.getPrice()*p.getQuantity(); 
		}
		System.out.println("Total Inventory Value = " + totalValue);	
	}
	
	
}
