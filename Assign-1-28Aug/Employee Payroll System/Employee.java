public class Employee {

    int empid;
    String name;
    int basicSalary;

    public Employee(int empid, String name, int basicSalary)
    {
        this.empid=empid;
        this.name=name;
        this.basicSalary=basicSalary;
    }

    public double calculateGrossSalary() 
    {
        double hra = 0.20 * this.basicSalary;  // 20% of basic
        double da = 0.10 * this.basicSalary;   // 10% of basic
        return this.basicSalary + hra + da;
    }

    void displayEmployee()
    {
        System.out.println(empid+name+basicSalary);
    }


}