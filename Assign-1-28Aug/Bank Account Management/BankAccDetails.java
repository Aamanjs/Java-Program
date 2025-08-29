import java.util.Scanner;
public class BankAccDetails {

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bankaccounts[] ba = new Bankaccounts[2];

        for(int i=0; i<ba.length; i++)
        {
            System.out.println("Enter Account Number, Holder Name, Balance:");
            int acaccountNumbercNo = s.nextInt();
            String holderName = s.next();
            int bal = s.nextInt();

            ba[i] = new Bankaccounts(s.nextInt(),s.next(),s.nextInt());
        }

        System.out.println("\n--- Bank Accounts ---");
        for(int i=0; i<ba.length; i++)
        {
            ba[i].displayBankaccounts();
        }

        System.out.println("\n--- Transactions on first account ---");
        System.out.println("Enter amount to deposit:");
        int depositamount = s.nextInt();
        ba[0].deposit(depositamount);

        System.out.println("Enter amount to withdraw:");
        int withdrawamount = s.nextInt();
        ba[0].withdraw(withdrawamount);

        ba[0].checkBalance();

        s.close();


    }
}