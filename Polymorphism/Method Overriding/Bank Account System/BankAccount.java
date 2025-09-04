public class BankAccount {
    long accountNumber;
    int balance;
   
    BankAccount(){
    accountNumber = 00000000000;
    balance = 500;
    }

    BankAccount(long accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void calculateInterest(){
        balance += balance*0.02;
        System.out.println("Total balance amount with interest is "+balance);
    }
}

class SavingsAccount extends BankAccount{

    SavingsAccount(long accountNumber, int balance){
        super(accountNumber,balance);
    }

    void calculateInterest(){
        balance += balance*0.02;
        System.out.println("Total balance amount of Savings Account with interest is "+balance);
    }
}

class FixedDepositAccount extends BankAccount{

    FixedDepositAccount(long accountNumber, int balance){
        super(accountNumber,balance);
    }

    void calculateInterest(){
        balance += balance*0.04;
        System.out.println("Total balance amount of Fixed Deposit Account with interest is "+balance);
    }
}


