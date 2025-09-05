import java.util.Scanner;

public class MainVehicle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vehicle v = new Vehicle();
        Car c = new Car("Audi", 100);
        Bike b = new Bike("Honda", 60);
        Truck t = new Truck("Tata", 80);

        System.out.println("Vehicle Speed Limit");

        while (true) {
            System.out.println("Enter case: c, b, t and exit");
            String input = scan.next();
            if(input.equals("Exit")){
                break;
            }
            switch(input){
                case "c": System.out.println("Car Speed limit");
                c.showTopSpeed();
                break;
                case "b": System.out.println("Bike Speed limit");
                b.showTopSpeed();
                break;
                case "t": System.out.println("Truck Speed limit");
                t.showTopSpeed();
                break;
                default: System.out.println("Invalid input!!");
            }
            
        }

        scan.close();
    }


    
}
