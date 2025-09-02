
import java.util.Scanner;

public class MainPerson {
	public static void main(String[] args) {
		
		Teacher.ratePerHour = 500;
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[5];
		Teacher[] t = new Teacher[5];

		StudentDetails sds = new StudentDetails();
		s = sds.createObjs();

		TeacherDetails tds = new TeacherDetails();
		t = tds.createObjt();

		System.out.println("Welcome to Educational institute !!!!");

		while (true) {
			System.out.print("Enter the case: cg, cs and exit ");
			String input = sc.next();
			int number;
			if(input.equals("exit")) {
				break; 
			}
			switch(input) { 
			case "cg": System.out.println("Student Grade");
			for(int i=0;i<s.length;i++) {
				System.out.print("Enter marks of "+s[i].name+" ");				//number = sc.nextInt();
				System.out.println("Grade of "+s[i].name+" is "+s[i].calculateGrade(sc.nextInt()));
			}
			break;
			case "cs": System.out.println("Teachers's Salary"); 
			for(int i=0;i<t.length;i++) {
				System.out.print("Enter hours worked for "+t[i].name+" "); 				
				t[i].calculateSalary(sc.nextInt()); 				
			}
					 
			
			}
			
			
		}


	}

}
