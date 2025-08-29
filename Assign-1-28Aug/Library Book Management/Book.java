
public class Book {
    
    int bookId;
    String title;
    String author;
    boolean isIssued;

    public Book(int bookId, String title, String author, boolean isIsssued){
        this.bookId = bookId;
        this.title = author;
        this.author = author;
        this.isIssued = isIsssued;
    }

    public void issueBook(){
        if(isIssued = true){
            System.out.println("The book is issued");
        }else System.out.println("The book is not issued yet");
    }

    public void returnBook() {
    	
    	}

    public void displayBook(){
        System.out.println(bookId+" "+title+" "+author);
    }
}
