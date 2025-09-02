
public class Person {

	String name;
	int age;
	int id;

	Person() {
		name = "Empty";
		age = 0;
		id = 0;
	}

	Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

}

class Student extends Person {

	Student() {
		super();
	}

	Student(String name, int age, int id){
        super(name,age,id);
    }

	char calculateGrade(int marks) {
		if (marks > 90) {
			return 'A';
		} else if (marks > 80) {
			return 'B';
		} else if (marks > 70) {
			return 'C';
		} else if (marks > 60) {
			return 'D';
		} else if (marks > 60) {
			return 'E';
		} else
			return 'F';
	}
}

class Teacher extends Person {
	static int ratePerHour;

	Teacher() {
	}

	Teacher(String name, int age, int id){
        super(name, age, id);
    }

	void calculateSalary(int hoursWorked) {
		System.out.println("Total Salary of " + name + " is " + ratePerHour * hoursWorked + " rupees");
	}
}