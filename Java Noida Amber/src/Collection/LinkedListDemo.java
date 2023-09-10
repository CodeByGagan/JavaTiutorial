package Collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println(list);
		
		list.add(2, "Gagan");
		System.out.println(list);
		
		list.remove("Gagan");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.addFirst("Zero");
		System.out.println(list);
		
		list.offerFirst("negOne");
		System.out.println(list);
		
		list.addLast("Five");
		System.out.println(list);
		
		list.offerLast("Six");
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.pollFirst();
		System.out.println(list);
		
		list.pollLast();
		System.out.println(list);
		
		String s1 = list.get(1); // to get the value from specific index
		System.out.println(s1);
		
		list.set(2, "Five");  // to change the value at specific index
		System.out.println(list);
		
		
	}

}
