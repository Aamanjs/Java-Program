
import java.util.Stack;


public class Temp {
    
    public static void main(String[] args){

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Pushed 4 temperatures");
        
        for(Integer ele:s)
        {
            System.out.println(ele);
        }
        
        System.out.println("---------------");
        
        System.out.println("Pop element 1");
        Integer ele = s.pop();
        System.out.println(ele);
        
        System.out.println("---------------");
        
        System.out.println("Pop element 2");
        	Integer ele1 = s.pop();
        	System.out.println(ele1);
        	
        	System.out.println("--------------");
        	
        	System.out.println("Peek at top element");
        	Integer ele2 = s.peek();
        	System.out.println(ele2);
        	
        	System.out.println("--------------");
        	
        	System.out.println("Checking if stack is empty");
        	System.out.println(s.isEmpty());
    }
}

