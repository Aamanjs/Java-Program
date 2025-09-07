import java.util.Scanner;

public class MainPayment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        CreditCardPayment c = new CreditCardPayment("AHJSGRB59329", "842265000000");
        UPIPayment u = new UPIPayment("swdwvcffg189583", "19896568000");

        System.out.println("Welcome to Online Payment Ssytem");

        while(true){
            System.out.println("Enter the case: ct, ut and exit");
            input = scan.next().toLowerCase();
            if(input.equals("exit")){
                System.out.println("Exited from the system");
                break;
            }
            switch(input){
                case "ct" : System.out.println("Credit Card Transaction");
                while(true){
                    System.out.println("Enter the case: pp, rp and exit ");
                    input = scan.next().toLowerCase();
                    double amount;
                    if(input.equals("exit")){
                    System.out.println("Exited from Credit Card Transactions");
                    break;
                    }
                    switch(input){
                        case "pp" : System.out.println("Process Payment");
                        System.out.println("Enter the amount to be transfered");
                        c.processPayment(scan.nextDouble());
                        break;
                        case "rp" : System.out.println("Refund Payment");
                        System.out.println("Enter the amount to be transfered");
                        c.refund(scan.nextDouble());
                        break;
                        default: System.out.println("Invalid Input!!");
                    }
                }
                break;
                case "ut" : System.out.println("UPI Transaction");
                while(true){
                    System.out.println("Enter the case: pp, rp and exit ");
                    input = scan.next().toLowerCase();
                    double amount;
                    if(input.equals("exit")){
                    System.out.println("Exited from UPI Transactions");
                    break;
                    }
                    switch(input){
                        case "pp" : System.out.println("Process Payment");
                        System.out.println("Enter the amount to be transfered");
                        u.processPayment(scan.nextDouble());
                        break;
                        case "rp" : System.out.println("Refund Payment");
                        System.out.println("Enter the amount to be transfered");
                        u.refund(scan.nextDouble());
                        break;
                        default: System.out.println("Invalid Input!!");
                    }
                }
                break;
                default: System.out.println("Invalid Input!!!");
            }
        }
        scan.close();
    }
    
}
