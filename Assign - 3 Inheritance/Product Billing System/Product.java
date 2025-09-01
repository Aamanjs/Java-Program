
public class Product {
    
    String productName;
    int price;

    Product(){
        productName = "Asus";
        price = 78000;
    }

    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

    void showProduct(){
        System.out.println("Product Name: "+this.productName);
        System.out.println("Price: "+price);
    }
}

class DiscountProduct extends Product{
    double discountRate;

    DiscountProduct(){
        discountRate = 0.1;
    }

    DiscountProduct(double discountRate){
        this.discountRate = discountRate;
    }

    int calculateFinalPrice(){
        this.price -= this.price*discountRate;
        return this.price;
    }
}
