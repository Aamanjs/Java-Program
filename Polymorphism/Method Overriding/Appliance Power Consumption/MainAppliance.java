import java.util.Scanner;

public class MainAppliance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Appliance a = new Appliance();
        Fan f = new Fan("Fan", 30);
        AC ac = new AC("Air Conditioner", 90);
        Refridgerator r = new Refridgerator("Fridge", 80);

        System.out.println("Appliance Power Consumption");

        while(true){
            System.out.println("Enter case f, a, r and Exit");
            String input =  scan.next();
            if(input.equals("Exit")||input.equals("exit")){
            		System.out.println("You are exited from the system");
                break;
            }
            switch(input){
                case "f" : System.out.println("Enter the number of hours");
                int hours = scan.nextInt();
                f.showConsumption(hours);
                break;
                case "a" : System.out.println("Enter the number of hours");
                int ahours = scan.nextInt();
                ac.showConsumption(ahours);
                break;
                case "r" : System.out.println("Enter the number of hours");
                int fhours = scan.nextInt();
                r.showConsumption(fhours);
                break;
                default: System.out.println("Invalid input!!!");
            }
        }
        scan.close(); 
    }
    
}

