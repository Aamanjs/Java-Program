import java.util.Scanner;

class Student {

        int rollNo;
        String name;
        String cname;
        String subject;
        int marks;

        public void acceptDetails()
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter Roll No: ");
            rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter College Name: ");
            cname = sc.nextLine();

            System.out.print("Enter Subject: ");
            subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks = sc.nextInt();

            sc.close();

        }


        public void displayStudentInfo() 
        {
            System.out.println("\n--- Student Information ---");
            System.out.println("Roll No    : " + rollNo);
            System.out.println("Name       : " + name);
            System.out.println("College    : " + cname);
            System.out.println("Subject    : " + subject);
            System.out.println("Marks      : " + marks);
        }

        public void findResult() 
        {
            if (marks >= 40) 
            {
                System.out.println("Result     : Pass");
            } else {
                System.out.println("Result     : Fail ❌");
            }
        }

        public class StudentTest 
        {
            public static void main(String[] args) 
            {
                Student[] students = new Student[5];

                for (int i = 0; i < 5; i++) 
                {
                    System.out.println("\nEnter details for Student " + (i + 1));
                    students[i] = new Student();
                    students[i].acceptDetails();
                }

                for (int i = 0; i < 5; i++) 
                {
                students[i].displayStudentInfo();
                students[i].findResult();
                }
            }
        }

     

}
