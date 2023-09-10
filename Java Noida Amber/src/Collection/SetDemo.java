package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
			s.add("Rohan");
			s.add("Rohan");
			s.add("Sohan");
			s.add("Mohan");

			System.out.println("Hashset......................................");
			System.out.println(s);

		Iterator<String> it =  s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

			Set<String> s2 = new LinkedHashSet<>();
			s2.add("Cat");
			s2.add("Dog");
			s2.add("Rat");
			s2.add("Bat");
			
			System.out.println("LinkedHashset......................................");
			Iterator<String> it2 = s2.iterator();
			
			while(it2.hasNext()) {
				System.out.println(it2.next());
			
			}
			s2.remove("Cat");
			System.out.println(s2);
			s2.remove(1); // will not work due to no indexing in java
			System.out.println(s2);

		TreeSet<String> ts = new TreeSet<>();
		// TreeSet stores data in ascending order

			ts.add("Red");
			ts.add("Blue");
			ts.add("Green");
			ts.add("Gray");

			System.out.println("TreeSet......................................");
			System.out.println(ts);
			Iterator<String> it3 = ts.descendingIterator();
			while(it3.hasNext()) {
				System.out.println(it3.next());
			}

	}

}
