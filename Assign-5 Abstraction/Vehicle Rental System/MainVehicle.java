import java.util.Scanner;

class MainVehicle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car[] c = new Car[5];
        Bike[] b = new Bike[5];

        CarDetails cd = new CarDetails();
        c = cd.createObjc();

        BikeDetails bd = new BikeDetails();
        b = bd.createObjb();

        System.out.println("Welcome to Vehicle Rental System");

        while (true) {
            System.out.println("Enter the case: b, c and Exit");
            String input = scan.next().toLowerCase();
            int days;
            if(input.equals("exit")){
                System.out.println("Exited from the system");
                break;
            }
            switch(input){
                case "b" : System.out.println("Bike rental charges");
                for(int i = 0; i<b.length; i++){
                    System.out.println("Enter no of days: ");
                    System.out.println("The rent for "+b[i].vehicleNumber+" is "+b[i].calculateRent(scan.nextInt())+" rupees");
                }
                break;
                case "c" : System.out.println("Car rental charges");
                for(int i = 0; i<c.length; i++){
                    System.out.println("Enter no of days: ");
                    System.out.println("The rent for "+c[i].vehicleNumber+" is "+c[i].calculateRent(scan.nextInt())+" rupees");
                }
                break;
                default: System.out.println("Invalid input!!");

            }
            
        }

        scan.close();
    }
    
}
