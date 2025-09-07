
public interface Payment {
    
    void processPayment(double amount);

    void refund(double amount);

}

class CreditCardPayment implements Payment{

    private  String transactionID;
    private  String accountNumber; 

    CreditCardPayment(String transactionID, String accountNumber){
        this.transactionID = transactionID;
        this.accountNumber = accountNumber;
    }


    public void processPayment(double amount){
        System.out.println(" Processing Card Payment of "+ amount +" rupees");
        System.out.println("| Transaction ID: "+ transactionID );
        System.out.println("| Account Number: "+ accountNumber);
    }

    public void refund(double amount){
        System.out.println("Payment of "+ amount +" rupees, refunded succesfully to Credit Card");
        System.out.println("| Transaction ID: "+ transactionID );
        System.out.println("| Account Number: "+ accountNumber);
    }

}

class UPIPayment implements Payment{

    private  String transactionID;
    private  String accountNumber; 

    UPIPayment(String transactionID, String accountNumber){
        this.transactionID = transactionID;
        this.accountNumber = accountNumber;
    }


    public void processPayment(double amount){
        System.out.println(" Processing UPI Payment of "+ amount +" rupees");
        System.out.println("| Transaction ID: "+ transactionID );
        System.out.println("| Account Number: "+ accountNumber);
    }

    public void refund(double amount){
        System.out.println("Payment of "+ amount +" rupees, refunded sucessfully to UPI");
        System.out.println("| Transaction ID: "+ transactionID );
        System.out.println("| Account Number: "+ accountNumber);
    }

}
