import java.util.Scanner;

public class SimpleInterest {
    
    public static int calculateSI(int p, int r, int t){
        return (p*r*t)/100;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount: ");
        int p = sc.nextInt();

        System.out.println("Enter Rate");
        int r = sc.nextInt();

        System.out.println("Enter Time");
        int t = sc.nextInt();

        int si = calculateSI(p, r, t);

        System.out.println("Simple Interest:" + si);

        sc.close();


    }
}
