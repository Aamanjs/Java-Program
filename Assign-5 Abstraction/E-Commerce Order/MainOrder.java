import java.util.Scanner;

public class MainOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        OnlineOrder oo = new OnlineOrder(101, "Aaman", 700);
        StoreOrder so = new StoreOrder(201, "Deep", 900);

        System.out.println("Welcome to E-commerce System");

        while(true){
            System.out.println("Enter the case: oo, so and exit");
            String input = scan.next().toLowerCase();
            if(input.equals("exit")){
                System.out.println("Exited from the system");
                break;
            }
            switch(input){
                case "oo" : System.out.println("Online Order System");
                oo.generateInvoice();
                break;
                case "so" : System.out.println("Store Order System");
                so.generateInvoice();
                break;
                default: System.out.println("Invalid Input!!!");
            }
        }

        scan.close();     
    
    }
}
