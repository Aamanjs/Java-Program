public class BankAccount {
    long accountNumber;
    int balance;
    BankAccount(){
        accountNumber = 000000000;
        balance = 0;
    }
    
    BankAccount(long accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    double deposit(double amount){
        this.balance += (double)(amount);
        return this.balance;
    }
}

class SavingsAccount extends BankAccount{
    float interestRate;
    SavingsAccount(){
        interestRate = 0.07f;
    }
    SavingsAccount(float interestRate){
        this.interestRate = interestRate;
    }
    void calculateInterest() {
        System.out.println("Your interest is: "+this.balance*interestRate);
    }
}