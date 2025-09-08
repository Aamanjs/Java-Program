public class Book{

    int bid;
    String title;
    String author;
    double price;

    public Book(int bid, String title,String author,int price){
        this.bid = bid;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString(){
        return "BookID: " + bid + ", Title: "+ title +", Author: "+ author +", Price "+ price;
    }
}