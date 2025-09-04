import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        BankAccount b = new BankAccount(10001, 1000);
        SavingsAccount s = new SavingsAccount(20002, 2000);
        FixedDepositAccount f = new FixedDepositAccount(30003, 3000);
        

        System.out.println("Welcome to Bank Account System");

        while(true){
            System.out.println("Enter case: ci, saci, fdci and exit");
            String input = scan.next();
            if(input.equals("exit")){
                break;
            }
            switch(input){
                case "ci" : System.out.println("Current Account");
                b.calculateInterest();
                break;
                case "saci" : System.out.println("Savings Account");
                s.calculateInterest();
                break;
                case "fdci" : System.out.println("Fixed Deposit Account");
                f.calculateInterest();
                break;
                default: System.out.println("Invalid input!!");
            }
        }
        scan.close();
    }
}
