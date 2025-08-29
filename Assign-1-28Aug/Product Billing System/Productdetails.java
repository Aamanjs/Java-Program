import java.util.Scanner;


public class Productdetails {

    public static void main(String[] args) {
        
        Product[] p = new Product[2];
        Scanner sc = new Scanner(System.in);

        // Input details
        for(int i = 0; i<p.length; i++)
        {
            System.out.println("Enter productId, productName, price, and quantity for product " + (i + 1) + ":");
            p[i] = new Product(sc.nextInt(), sc.next(), sc.nextInt(),sc.nextInt());
        }

        // Dispaly details
        System.out.println("\n--- Product Details ---");
        for(int i=0; i<p.length; i++)
        {
            p[i].displayProduct();
        }

        // Calculate total bill
        int totalamt = 0;
        for(int i=0; i<p.length; i++){
            totalamt += p[i].getTotalAmount();
        }
        System.out.println("Total bill amount for all products id: " + totalamt);

        sc.close();

    }
    
}
