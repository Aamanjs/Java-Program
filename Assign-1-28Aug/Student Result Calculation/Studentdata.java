
import java.util.Scanner;

public class Studentdata {

    public static void main(String[] args) {
        Student[] s = new Student[3];
        Scanner sc = new Scanner(System.in);

        //Input for student
        for(int i=0; i<s.length; i++)
        {
        	System.out.println("Enter rollno, name, and 3 subject marks for Student " + (i + 1) + ":");
            s[i] = new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }

        //Display student info
        System.out.println("\n--- Student Results ---");
        for(int i=0; i<s.length; i++)
        {
            s[i].displayStudent();
            System.out.println("Average marks of 3 subject is: " + s[i].averagemarks());
            System.out.println(s[i].Grade());
        }

        sc.close();
    }
    
}

