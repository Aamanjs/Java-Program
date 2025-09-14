
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		StudentManagementSystem sms = new StudentManagementSystem();

		FileOutputStream fo = new FileOutputStream("Stud.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);

		while (true) {

			System.out.println("--------- Student Management System ---------");
			System.out.println(" 1. Add Student ");
			System.out.println(" 2. View All Student ");
			System.out.println(" 3. Update Student");
			System.out.println(" 4. Delete Student");
			System.out.println(" 5. Exit");

			int input = sc.nextInt();
			if (input == 5) {
				System.out.println("Exited from the system");
				break;
			}

			switch (input) {
			case 1:
				System.out.println("Enter Student Id");
				int id = sc.nextInt();

				System.out.println("Enter Student Name");
				String name = sc.next();

				System.out.println("Enter Student Course");
				String course = sc.next();

				System.out.println("Enter Student Marks");
				int marks = sc.nextInt();

				Student s = new Student(id, name, course, marks);
				sms.addStudent(s);

				break;

			case 2:
				sms.viewStudent();
				break;
				
			case 3:
				sms.updateStudent();
				break;
				
			case 4:
				sms.deleteStudent();
				break;
				
			default: System.out.println("Inavlid Input!!");
				
				
			}

		}

	}

}

