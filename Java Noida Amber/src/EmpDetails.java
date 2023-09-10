
public class EmpDetails {

	public static void main(String[] args) {
//		Employee1 emp1 = new Employee1("Rohan", 1, "IT", 454545.2);
		new Employee1("Rohan", 1, "IT", 454545.2).showEmpDetails();
//		Employee1 emp2 = new Employee1();
		
//		emp1.showEmpDetails();
	}

}
class Employee1{
	//instance var
	String empName, empDept;
	int empId;
	double empsalary;
	
	//requirement --> initializtion
	//java allows automatic initialization at the time of creation of obj by a constructor
	//constructor is a special method which has no written type, it has same name as its class
	//2 types of constructor 1.parameterize, 2.non-parameterize
	//upon obj creation, constructor gets called automatically
	//default constructor initialize all the instance var with default value of var DT
	public Employee1(String name, int id, String dept, double salary) {
		empName = name;
		empId = id;
		empDept = dept;
		empsalary = salary;
	}
	
	void showEmpDetails() {
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Department: "+empDept);
		System.out.println("Employee Salary: "+empsalary);
	}
	
}