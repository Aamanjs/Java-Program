
import java.util.Scanner;

public class MainVehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car veh = new Car();
        while(true){
            System.out.println("Enter case: f, rf, td, exit");
            String input = scan.next();
            if(input.equals("exit")){
                break;
            }
            switch(input){
                case "f": System.out.println("Current fuel is "+veh.fuel+" litres");
                break;
                case "td": veh.calculateTravelDistance();
                break;
                case "rf": System.out.println("Enter litres to refuel");
                int refuelinp = scan.nextInt();
                System.out.println("Total fuel available: "+veh.refuel(refuelinp)+" litres");
                break;
                default: System.out.println("Invalid input");
            }
        }

        scan.close();
    }
}

