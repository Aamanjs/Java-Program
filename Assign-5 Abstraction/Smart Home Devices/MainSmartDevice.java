import java.util.Scanner;

public class MainSmartDevice {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input ;

        Light l = new Light("L101");
        Fan f = new Fan("F201");

        System.out.println("Welcome to Smart Device");

        System.out.println("\n--- Smart Home Menu ---");
            System.out.println("1. Turn ON Light");
            System.out.println("2. Turn OFF Light");
            System.out.println("3. Light Status");
            System.out.println("4. Turn ON Fan");
            System.out.println("5. Turn OFF Fan");
            System.out.println("6. Fan Status");
            System.out.println("0. Exit");

        while(true) {
            System.out.println("Enter case : ");
            input = scan.nextInt();
            if(input == 0){
                System.out.println("Exited from the system");
                break;
            }
            switch(input){
                case 1: l.turnOn();
                break;
                case 2: l.turnOff();
                break;
                case 3: System.out.println(l.getStatus());
                break;
                case 4: f.turnOn();
                break;
                case 5: f.turnOff();
                break;
                case 6: System.out.println(f.getStatus());
                break;
                default: System.out.println("Invalid Input!!");
            }
        }

        scan.close();
    }
}
