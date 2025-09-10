

public class Product {
    int productId;
    String productName;
    double price;
    int quantity;
    
    Product(int productId, String productName, double price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	void displayProductDetails(){
        System.out.println("ProductID: "+ productId + ", Product Name: " + productName + ", Price: " + price + ", Quantity: " + quantity);
    }
	double calculateTotalInventoryValueWithDiscounts() {
		return 0;
	}
}


class Electronics extends Product implements ProductInterface{
	
	String warrantyPeriod;

	
	public Electronics(int productId, String productName, double price, int quantity, String warrantyPeriod) {
		super(productId, productName, price, quantity);
		this.warrantyPeriod = warrantyPeriod;
	}
	
	
	@Override
	void displayProductDetails(){
		System.out.println("ProductID: "+ productId + ", Product Name: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Warranty Period: " + warrantyPeriod +" year");
	}
	
	
	@Override
	public double calculateDiscount() {
		double discount = 0.1;
		price -= price * discount;
		return price ;
	}
	@Override
	double calculateTotalInventoryValueWithDiscounts() {
		return calculateDiscount()*quantity;
	}
	
}

class Groceries extends Product implements ProductInterface{
	
	String expiryDate;

	public Groceries(int productId, String productName, double price, int quantity, String expiryDate) {
		super(productId, productName, price, quantity);
		this.expiryDate = expiryDate;
	}
		// TODO Auto-generated constructor stub
	
	@Override
	void displayProductDetails(){
		System.out.println("ProductID: "+ productId + ", Product Name: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Expiry Date: " + expiryDate);
	}
	
	@Override
	public double calculateDiscount() {
		double discount = 0.05;
		price -= price * discount;
		return price ;
	}
	@Override
	double calculateTotalInventoryValueWithDiscounts() {
		return calculateDiscount()*quantity;
	}
	
}

class Furniture extends Product implements ProductInterface {
	
	String material;

	public Furniture(int productId, String productName, double price, int quantity, String material) {
		super(productId, productName, price, quantity);
		this.material = material;
	}
	
	@Override
	void displayProductDetails(){
		System.out.println("ProductID: "+ productId + ", Product Name: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Material: " + material);
	}
	
	@Override
	public double calculateDiscount() {
		double discount = 0.15;
		price -= price * discount;;
		return price;
	}
	@Override
	double calculateTotalInventoryValueWithDiscounts() {
		return calculateDiscount()*quantity;
	}
	
}





