
public class Main {

    public static void main(String[] args) {
        CartManager cm = new CartManager();

        Product[] p = cm.createproduct();
        
        cm.displayProduct(p);
    }
    
}
