
import java.util.Arrays;

class Printer{

    void print(String message) {
        System.out.println("Print String: "+message);
    }

    void print(int number){
        System.out.println("Printing int: "+number);
    }

    void print(double value){
        System.out.println("Print double: "+value);
    }

    void print( String[] items){
        System.out.println("Print String array: "+Arrays.toString(items));
    }
    void print( CreateObject obj){
        System.out.println(obj.toString());
    }
}