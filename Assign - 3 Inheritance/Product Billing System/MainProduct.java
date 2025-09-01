import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Product Billing System");
        DiscountProduct entity = new DiscountProduct();

        while (true) {
            System.out.println("Enter the case sp, fp and exit");
            String input = scan.next();
            if (input.equals("exit")) {
                break;
            }
            switch (input) {
                case "sp": entity.showProduct();
                break;
                case "fp": System.out.println("The final price with discount is "+entity.calculateFinalPrice());   
                break; 
                default: System.out.println("Invalid Input!!!");
                break;
            } 
            
        }

        scan.close();
    }    
}
