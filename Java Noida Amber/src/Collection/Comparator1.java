package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator1 {

	public static void main(String[] args) {

		ArrayList<Employee> st1 = new ArrayList<Employee>();
		
		st1.add(new Employee(1, 15, "Rohan"));
		st1.add(new Employee(2, 13, "Sohan"));
		st1.add(new Employee(3, 15, "Mohan"));
		st1.add(new Employee(4, 14, "Gohan"));
		st1.add(new Employee(5, 16, "Goku"));
		
		System.out.println("Sorting based on name");
		
		Collections.sort(st1, new NameCompare());
		for(Employee emp:st1) {
			System.out.println(emp.empId+", "+emp.age+", "+emp.name);
		}
		
		System.out.println("\nSorting based on age");
		
		Collections.sort(st1, new AgeCompare());
		for(Employee emp:st1) {
			System.out.println(emp.empId+", "+emp.age+", "+emp.name);
		}
		
		
		
	}

}
//comparable operator can sort in more than one criteria
//Comparable	Comparator
//1) Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price.	The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
//2) Comparable affects the original class, i.e., the actual class is modified.	Comparator doesn't affect the original class, i.e., the actual class is not modified.
//3) Comparable provides compareTo() method to sort elements.	Comparator provides compare() method to sort elements.
//4) Comparable is present in java.lang package.	A Comparator is present in the java.util package.
//5) We can sort the list elements of Comparable type by Collections.sort(List) method.	We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
//Comparable and Comparator both are interfaces and can be used to sort collection elements.

class Employee {
	
	int empId, age;
	String name;
	
	public Employee(int empId, int age, String name) {
		this.name = name;
		this.empId = empId;
		this.age = age;
	}

	
}

class AgeCompare implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		
		if(e1.age==e2.age) {
			return 0;
		}else if(e1.age<e2.age){
			return 1;
		}else {
			return -1;
		}
		
	}
	
}

class NameCompare implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		
		return e1.name.compareTo(e2.name);
		
	}
	
}








