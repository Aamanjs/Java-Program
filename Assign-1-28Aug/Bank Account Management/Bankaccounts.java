
public class Bankaccounts {

    int accountNumber;
    String holderName;
    int balance;

    public Bankaccounts(int accountNumber, String holderName, int balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public void deposit(int depositamount) {
        if(depositamount>0) {
            balance += depositamount;
            System.out.println("Deposited: " + depositamount + " | New Balance: " + balance);
        }else System.out.println("Invalid deposit amount!");

    }

    public void withdraw(int withdrawamount){
        if(withdrawamount>0) {
            balance -= withdrawamount;
            System.out.println("Withdrawn: " + withdrawamount + " | New Balance: " + balance);
        }else System.out.println("Invalid amount or Insufficient balance!");

    }

    public void checkBalance(){
        System.out.println("Account balance is" + balance);
    }

    void displayBankaccount()
    {
        System.out.println(accountNumber+" "+holderName+" "+balance);
    }
    
}
