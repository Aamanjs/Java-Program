import java.util.Scanner;

public class MainVehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your Vehicle!!!");
        ElectricCar obj = new ElectricCar();
        
        while (true) {
            System.out.println("Enter case: di, scd, bc and exit");
            String input = scan.next();
            if(input.equals("exit")){
                break;
            }
            switch(input){
                case "di": obj.displayInfo();
                break;
                case "scd": obj.showCarDetails();
                break;
                case "bc": obj.showElectricCarDetails();
                break;
                default: System.out.println("Invalid input !!!");
            }

            
        }

        scan.close();

    }
}
