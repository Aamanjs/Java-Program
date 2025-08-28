import java.util.Scanner;

public class maxelement {

    public static int findmax(int[] num)
    {
        int max = num[0];
        for(int i=0; i<num.length; i++)
        {
            if(num[i]>max)
            {
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int [] num = new int[4];

        for(int i=0; i<4; i++){
            num[i]=sc.nextInt();     
        }

       //System.out.println("\nNumbers entered: "); 
        //for(int i=0; i<4; i++)  {
            //System.out.println(num[i]);
        //}

        int max=findmax(num);
        System.out.println("Max num is: " + max);

        sc.close();

    }
    
}
