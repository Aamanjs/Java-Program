import java.util.Scanner;

public class MainStudent {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Student Grading System");
        GraduateStudent person = new GraduateStudent();

        while(true){
            System.out.println("Enter case g, sh and exit ");
            String input = scan.next();
            if(input.equals("exit")){
                break;
            }
            switch(input){
                case "g": person.showDetails();
                break;
                case "sh" : person.checkPass();
                break;
                default: System.out.println("Invalid input!!!");
            }

        }
        scan.close();
    }
}
