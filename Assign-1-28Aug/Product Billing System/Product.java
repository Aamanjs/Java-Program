
public class Product {

    int productid;
    String productName;
    int price;
    int quantity;

    public Product(int productid, String productName, int price, int quantity){
        this.productid = productid;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalAmount() {
        return price * quantity;
    }

    public void displayProduct(){
        System.out.println(productid+" "+productName+" "+price);
    }
    
}
