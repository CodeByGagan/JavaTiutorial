
public class RevisionBeforeArrayList2 {

	public static void main(String[] args) {

	}

}

abstract class Emp{
	
	int empId;
	String empName;
	static String deptName = "Trainee";
	
	public abstract void calcSalary();
	
	public void display() {
		
	}
}

abstract class Emp1{
//	abstract void display2();
}

class Trainee extends Emp{

	@Override
	public void calcSalary() {
	}
	
}