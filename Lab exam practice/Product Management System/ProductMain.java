
public class ProductMain {

	public static void main(String[] args) {
		
		
		Electronics e = new Electronics(101, "TV", 34000, 2, "1");
		Groceries g = new Groceries(201, "vegggies", 300, 2, "24 Sep");
		Furniture f = new Furniture(301, "Cupboard", 3000, 100, "teakwood");
		
		e.displayProductDetails();
		g.displayProductDetails();
		f.displayProductDetails();
		
		System.out.print(e.calculateTotalInventoryValueWithDiscounts()+f.calculateTotalInventoryValueWithDiscounts()+g.calculateTotalInventoryValueWithDiscounts());
		
		
        
    }

}
