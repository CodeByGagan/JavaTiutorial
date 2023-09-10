public class Assignment16Aug1 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Rohan", 1);
		Student s2 = new Student("Sohan", 2);
		
		s1.display();
		s2.display();

	}

}
// create a clss 'student'
class Student{
	
	static String college = "ABcollege"; // static var for college name
	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;  // assigning argument value to the instance var
		this.rollNo = rollNo;
	}
	
	public void display() {
		System.out.println("Student name: "+name+", Student Roll number: "+rollNo+", College Name: "+college);
		
	}
}
