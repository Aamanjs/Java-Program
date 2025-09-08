
import java.util.PriorityQueue;

public class Ticket {

	public static void main(String[] Args) {
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(4);
		p.add(5);
		
		System.out.println("Enqueued 5 customer tokens");
		
		for(Integer ele: p) {
			System.out.println(ele);
		}
		
		System.out.println("---------------------------------------");
		
		System.out.println("Dequeued first 2 customer tokens");
		
		Integer ele = p.poll();
		System.out.println(ele);
		
		Integer ele1 = p.poll();
		System.out.println(ele1);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Peek at next customer");
		
		Integer ele2 = p.peek();
		System.out.println(ele2);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Check if queue is empty");
		System.out.println(p.isEmpty());
		
		
		
	}
}
