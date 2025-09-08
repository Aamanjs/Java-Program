
import java.util.LinkedList;

public class Task {

	public static void main(String[] args){
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println("5 task added into the list");
		
		for(Integer ele: ll) {
			System.out.println(ele);
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.println("A new task added at the beginning and ending");
		
		ll.addFirst(8);
		ll.addLast(100);
		
		for(Integer ele: ll) {
			System.out.println(ele);
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Removed a task from middle");
		
		ll.remove(3);
		
		for(Integer ele: ll) {
			System.out.println(ele);
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Displaying first and last task");
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println("------------------------------------------------");

		System.out.println("Check Priority");
		
		int checkPriority = 40;
		if(ll.contains(checkPriority)) {
			System.out.println("Task with Priority " + checkPriority + " exists.");
		}else System.out.println("Task with Priority " + checkPriority + " not exists.");
		
		
	}
}
