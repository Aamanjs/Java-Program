
public class Employee {
    
    String name;
    int salary;

    Employee(){
        name = "Rutwik Arde";
        salary = 35000;
    }



    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee details are displayed: ");
        System.out.println("Employee Name: "+this.name+", Salary: "+salary);
    }
}

class Manager extends Employee{
    int teamSize;

    Manager(){
        teamSize = 10;
    }

    Manager(int teamSize){
        this.teamSize = teamSize;
    }

    int calculateBonus(){
        return this.salary*teamSize;
    }

}
