package Collection;
import java.util.*;

public class Comparable1 {

	public static void main(String[] args) {
		
		ArrayList<Student> st1 = new ArrayList<Student>();
		
		st1.add(new Student(1, 15, "Rohan"));
		st1.add(new Student(2, 13, "Sohan"));
		st1.add(new Student(3, 15, "Mohan"));
		st1.add(new Student(4, 14, "Gohan"));
		st1.add(new Student(5, 16, "Goku"));
		
		Collections.sort(st1);
		for(Student std:st1) {
			System.out.println(std.rollNo+", "+std.age+", "+std.name);
		}

	}

}
// comparable operator can sort in only one criteria
class Student implements Comparable<Student>{
	
	int rollNo, age;
	String name;
	
	public Student(int rollNo, int age, String name) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student s1) {
		
		if(age==s1.age) {
			return 0;
		}else if(age<s1.age){
			return 1;
		}else {
			return -1;
		}
		
	}
	
}