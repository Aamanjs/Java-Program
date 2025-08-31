import java.util.Scanner;
public class MainBank {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount();
        while(true){
            System.out.print("Enter the case: d, b, i, exit: ");
            String input = scan.next();
            if(input.equals("exit")){
                break;
            }
            switch(input){
                case "d": System.out.println("Enter amount: ");
                double depositInput = scan.nextDouble();
                System.out.println("Total amount "+account.deposit(depositInput));
                break;
                case "b": System.out.println("Here is your balance: "+account.balance);
                break;
                case "i": account.calculateInterest();
                break;
                default: System.out.println("Invalid input");
            }
        }

        scan.close();
    }
}
