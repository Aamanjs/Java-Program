import java.util.Scanner;

public class factorialex {

    public static int factorial(int num)
    {
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }

        return fact;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of "+ num +" is: "+ result);

        sc.close();

    }
}
