import java.util.Scanner;

public class grosssal {
    

    public static void main(String[] args) 
    {
        Employee[] e = new Employee[3];
        Scanner s = new Scanner(System.in);

        for(int i=0; i<e.length;i++)
        {
            e[i] = new Employee(s.nextInt(), s.next(), s.nextInt());
        }

        for(int i=0; i<e.length;i++)
        {
            e[i].displayEmployee();
            System.out.println("Gross Salary: " + e[i].calculateGrossSalary());

        }
        

        s.close();

    }
}
