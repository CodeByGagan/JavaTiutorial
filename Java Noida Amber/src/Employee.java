public class Employee {
	String name;
	int empId;
	double salary;
	String dept;

	public static void main(String[] args) {
		
		// creating obj of Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		// Assigning value to emp1
		emp1.name = "Spider Man";
		emp1.empId = 676;
		emp1.salary = 4.232;
		emp1.dept = "Super Hero";
		
		// Assigning value to emp2
		emp2.name = "Iron Man";
		emp2.empId = 111;
		emp2.salary = 564654544554.232;
		emp2.dept = "Super Hero";
		
		// Printing emp1 details
		System.out.println("Name: "+emp1.name);
		System.out.println("ID: "+emp1.empId);
		System.out.println("Salary: "+emp1.salary);
		System.out.println("Department: "+emp1.dept);
		
		// Printing emp2 details
		System.out.println("\nName: "+emp2.name);
		System.out.println("ID: "+emp2.empId);
		System.out.println("Salary: "+emp2.salary);
		System.out.println("Department: "+emp2.dept);
	}

}
