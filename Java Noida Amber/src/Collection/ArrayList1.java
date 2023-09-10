package Collection;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		
		System.out.println(a1.size());
		
		a1.add("One"); // adding element in a1 ArrayList
		a1.add("Two");
		a1.add("Three");
		a1.add("Four");
		System.out.println(a1.size());
		
		System.out.println(a1);
		a1.add(2, "Gagan");    // Adding element at index 2
		System.out.println(a1);
		
		a1.remove(2); // Removing element at index 2
		a1.remove("Four");  // Removing Four from a1
		System.out.println(a1); 
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(4);
		a2.add(3);
		a2.add(2);
		a2.add(1);
		a2.add(0);
		System.out.println(a2);
		
//		a2.remove(1);
//		System.out.println(a2);
		
		Integer arr[] = new Integer[a2.size()]; // initializing arr Array of same length as a2 ArrayList
		arr = a2.toArray(arr); // converint arr
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
