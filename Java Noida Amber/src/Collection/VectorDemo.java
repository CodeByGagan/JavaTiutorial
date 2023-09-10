package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<String>();
		
		v1.add("One");
		v1.add("Two");
		v1.add("Three");
		v1.add("Four");
		System.out.println(v1);
		
		v1.remove("Four");
		System.out.println(v1);
		
		v1.remove(0);
		System.out.println(v1);
		
		Iterator<String> it = v1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
