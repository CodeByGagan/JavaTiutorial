class StudentDetails{
	
	// instance variables
	// instance ---obj
	String name;
	int rollNo;
	int standard;
	double marks;
	double sportMarks;
	
	// initialization can be done in 3 ways
		// 1. By using reference
		// 2. By method
		// 3. By constructor
	
	// instance method
	// method is used for reuseability
//	void displayResult(){ // non returning method
//		double totalMarks = marks+sportMarks;
//		System.out.println("Total Marks: "+totalMarks);
//	}
	double displayResult(){ // method returning double DT
		double totalMarks = marks+sportMarks;
		return totalMarks; // method return type and return value should be compatible
	}
}
public class Student {
	
	public static void main(String[] args) {
		
		StudentDetails s1 = new StudentDetails();
		s1.name = "Rohan";
		s1.rollNo = 19;
		s1.standard = 7;
		s1.marks = 78.5;
		s1.sportMarks = 18.4;
		
		StudentDetails s2 = new StudentDetails();
		s2.name = "Sohan";
		s2.rollNo = 21;
		s2.standard = 7;
		s2.marks = 79.5;
		s2.sportMarks = 19.4;
		
		System.out.println("Name: "+s1.name);
		System.out.println("Roll No: "+s1.rollNo);
		System.out.println("Standard: "+s1.standard);
//		s1.displayResult() // method calling
		System.out.println("Total Marks: "+s1.displayResult());
		
		System.out.println("\nName: "+s2.name);
		System.out.println("Roll No: "+s2.rollNo);
		System.out.println("Standard: "+s2.standard);
//		s2.displayResult() // method calling
		System.out.println("Total Marks: "+s2.displayResult());
	}
	
}
