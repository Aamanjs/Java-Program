public class MainPrinter {
    public static void main(String[] args){

    Printer p = new Printer();
    String[] s = {"Apple","BlackBerry","Nokia"};
    CreateObject b = new CreateObject(8, "Yad");
    p.print("Hi buddy");
    p.print("42");
    p.print("89.94");
    p.print(s);
    p.print(b);
    //System.out.println(b.toString());

    }


}
