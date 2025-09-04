import java.util.Scanner;

public class MainEmployee {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee e = new Employee();
        Manager m = new Manager("Ankit", 30000);
        SoftwareEngineer s = new SoftwareEngineer("Vikesh", 40000);

        System.out.println("Welcome to Employee Salary System");

        while (true) {
            System.out.println("Enter case: ms, ses and Exit");
            String input = scan.next();
            if(input.equals("exit")){
                break;
            }
            switch(input){
                case "ms": System.out.println("Manager Salary");
                    m.calculateSalary();
                break;
                case "ses": System.out.println("Software Engineer Salary");
                    s.calculateSalary();
                break;
                default: System.out.println("Invalid input!!");
        
            }
            
        }



        scan.close();
        
    }
}
