import java.util.Scanner;

public class ReverseStringEx {

    public static String reverseString(String str){
        String reversed = "";

        for(int i = str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }
        return reversed;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        String reversedString = reverseString(input);
        System.out.println("Reverse string: "+ reversedString);

        sc.close();

    }
}
