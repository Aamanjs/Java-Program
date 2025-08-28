import java.util.Scanner;

public class NumberClassification {

    public static void classification(int num){
        if(num>0)
        {
            System.out.println(num+" is positive number");
        }else if(num<0){
            System.out.println(num+" is negative number");
        }else if(num==0){
            System.out.println(num+" is zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        classification(num);

        sc.close();
    }
    
}