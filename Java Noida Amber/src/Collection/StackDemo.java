package Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<String>();
		
		s1.push("One");
		s1.push("Two");
		s1.push("Three");
		s1.push("Four");
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		
		Iterator<String> it = s1.iterator(); // iterator is a method
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
