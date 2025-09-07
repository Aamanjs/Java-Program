
abstract class Order {
    
    int orderId;
    String customerName;
    int amount;

    Order(){
        orderId = 0;
        customerName = "ABC";
        amount = 0;
    }

    Order(int orderId,String customerName,int amount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    abstract void generateInvoice();
}

class OnlineOrder extends Order{
    private static double deliveryCharge = 70;    

    OnlineOrder(int orderId,String customerName,int amount){
        super(orderId, customerName, amount);
    }

    @Override
    void generateInvoice(){
        double total = amount + deliveryCharge;
        System.out.println("\n---- Online Order Invoice ----");
        System.out.println("Order ID       :" + orderId);
        System.out.println("Customer Name  :" + customerName);
        System.out.println("Amount         :" + amount);
        System.out.println("Delivery Fee   :" + deliveryCharge);
        System.out.println("Total Payable   :" + total);
        System.out.println("--------------------------------");
    }
}

class StoreOrder extends Order{
    private static double discount = 0.2;

    StoreOrder(int orderId,String customerName,int amount){
        super(orderId, customerName, amount);
    }

    @Override
    void generateInvoice(){
        double total = amount - discount;
        System.out.println("\n---- Online Order Invoice ----");
        System.out.println("Order ID       :" + orderId);
        System.out.println("Customer Name  :" + customerName);
        System.out.println("Amount         :" + amount);
        System.out.println("Discount       :" + discount);
        System.out.println("Total Payable   :" + total);
        System.out.println("--------------------------------");
    }
}

