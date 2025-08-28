import java.util.Scanner;

public class studentgrade {
    
    public static void calculateGrade (int marks){
        if(marks>=90)
        {
            System.out.println("Grade A");
        }else if(marks>=80){
            System.out.println("Grade B");
        }else if(marks>=70){
            System.out.println("Grade C");
        }else if(marks>=60){
            System.out.println("Grade D");
        }else if(marks>=50){
            System.out.println("Grade E");
        }else if(marks<50){
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();

        calculateGrade(marks);

        sc.close();
    }
}
