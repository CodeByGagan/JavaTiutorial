package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// In priority queue elements will automatically insert in sorted order
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("One");
		pq.add("Two");
		pq.add("Three");
		pq.add("Four");
		
//		PriorityQueue<String> pq1 = new PriorityQueue<String>(4);
//		pq1.add("Five");
//		pq1.add("Four");
//		pq1.add("Three");
//		pq1.add("Two");
//		pq1.add("One");
//		pq1.add("Zero");
		
		System.out.println(pq);
//		System.out.println(pq1);
		
//		PriorityQueue<Integer> intpq = new PriorityQueue<Integer>();
//		intpq.add(2);
//		intpq.add(0);
//		intpq.add(2);
//		intpq.add(3);
//		System.out.println(intpq);
		
		System.out.println(pq.peek()); // peack() is pointing to the head element
		pq.poll(); //used to fetch first element from queue
		System.out.println(pq);
		
		Iterator<String> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
