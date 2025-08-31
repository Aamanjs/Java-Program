import java.util.Scanner;

public class MainEmployee {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Employee Mangement System");
        Manager person = new Manager();

        while(true){
            System.out.println(" Enter case d, cb and exit");
            String input = scan.next();
            if(input.equals("exit")){
                break;
            }
            switch(input){
                case "d": person.display();
                break;
                case "cb": System.out.println("Calculated bonus is: "+person.calculateBonus());
                break;
                default: System.out.println("Invalid input!!!");
            }
            
        }
        scan.close();

    }
}
