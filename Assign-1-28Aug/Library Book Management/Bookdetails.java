import java.util.Scanner;

public class Bookdetails {

    public static void main(String[] args) {
        Book b = new Book[2];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<b.length; i++)
        {
        	System.out.println("Enter Book ID, Book Title, and Author " + (i + 1) + ":");
            b[i] = new Book(sc.nextInt(),sc.next(),sc.next(), sc.nextBoolean());
        }

        for(int i=0; i<b.length; i++)
        {
            b[i].displayBook();
            //System.out.println("Average marks of 3 subject is: " + s[i].averagemarks());
            //System.out.println(s[i].Grade());
        }

        b[0].issueBook();
    }
    
}
