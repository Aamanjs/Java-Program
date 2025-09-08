import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class MainBook {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Book b1 = new Book(101, "Java Program", "James Gosling", 450);
        Book b2 = new Book(102, "Python Crash Course", "Eric Matthes", 500);
        Book b3 = new Book(103, "Data Structures", "Mark Allen", 600);

        HashMap<Integer, Book> library = new HashMap<>();

        // 1. Add book using put()
        library.put(b1.bid, b1);
        library.put(b2.bid, b2);
        library.put(b3.bid, b3);

        //2. Retrieve a book by ID
        System.out.println("Retrieve Book ID 101 "+ library.get(101));

        //3. Check if a given book ID exists
        System.out.println("Contains Book ID 102 "+ library.containsKey(102));

        //4. Check if a particular Book object exists
        System.out.println("Contains b3 object? "+ library.containsValue(b3));

        //5. Display total number of books
        System.out.println("Total number of books in Library are "+ library.size());

        //6. Iterate through entries 
        System.out.println(" Using entrySet(): ");
        for(Entry<Integer, Book> entry : library.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

        System.out.println("Using KeySet():");
        for (Integer key : library.keySet()) {
            System.out.println(key + " " + library.get(key));
        }

        System.out.println("Using values():");
        for (Book book : library.values()) {
            System.out.println(book);
        }

        //7.update book id
        System.out.println("Enter the book ID to update");
        int id = scan.nextInt();
        Book obj = library.get(id);
        obj.price = 700;
        System.out.println(id + " price updated");
        System.out.println("Using KeySet():");
        for (Integer key : library.keySet()) {
            System.out.println(key + " " + library.get(key));
        }

        //8.remove book id
        System.out.println("Enter the book Id to be removed");
        int rid = scan.nextInt();
        library.remove(rid);
        System.out.println("Book ID " + rid + " deleted");
        System.out.println("Using KeySet():");
        for (Integer key : library.keySet()) {
            System.out.println(key + " " + library.get(key));
        }

        //9.clear all book
        library.clear();
        System.out.println("Library cleared");

        //10.verify if empty
        System.out.println("Is library empty ? "+ library.isEmpty());
        

    }
}
