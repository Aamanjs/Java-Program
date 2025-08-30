
public class Product {
    
    int productid;
    String productName;
    int price;
    int quantity;
    static int productCount = 0;

    public Product(int productid, String productName, int price, int quantity){
        this.productid = productid;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        productCount++;
    }

    public void displayProduct(){
        System.out.println(productid+" "+productName+" "+price);
    }
}
