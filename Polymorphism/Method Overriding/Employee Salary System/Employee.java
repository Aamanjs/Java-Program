
public class Employee {

    String name;
    int basicSalary;

    Employee(){
        name = "Vicky";
        basicSalary = 25000;
    }

    Employee(String name,int basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateSalary(){
        System.out.println("The basic Salary of "+name+" is "+basicSalary);
    }

}

class Manager extends Employee{

    static double allowance = 0.2;

    Manager(String name,int basicSalary){
        super(name,basicSalary);
    }

    @Override
    void calculateSalary() {
        System.out.println("Allowance of "+name+" is "+allowance*basicSalary);
        double total = basicSalary + (basicSalary*allowance);
        System.out.println("The basic salary of "+name+" with allowance is "+total);
    }
}

class SoftwareEngineer extends Employee{

    static double bonus = 0.15;

    SoftwareEngineer(String name,int basicSalary){
        super(name,basicSalary);
    }

    @Override
    void calculateSalary() {
        System.out.println("The bonus of "+name+" is "+basicSalary*bonus);
        double total = basicSalary + (basicSalary*bonus);
        System.out.println("The basic salary of "+name+" after including bonus is "+total);
    }

}