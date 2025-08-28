import java.util.Scanner;

public class ReverseNumber {
    
    public static int reverseDigits(int num){
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10; //last digit
            reversed = reversed * 10 + digit;
            num = num / 10;  //remove last digit
        }
        return reversed;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int reversedNumber = reverseDigits(num);
        System.out.println("Reversed number: "+ reversedNumber);

        sc.close();



    }
}
