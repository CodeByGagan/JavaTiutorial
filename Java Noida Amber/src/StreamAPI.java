import java.util.ArrayList;

public class StreamAPI {

	public static void main(String[] args) {
		
		ArrayList<Emp> arrEmp = new ArrayList<Emp>();
		
		arrEmp.add(new Emp(1, "Rohan", 12000.35));
		arrEmp.add(new Emp(2, "Gohan", 1000.35));
		arrEmp.add(new Emp(3, "Sohan", 14000.35));
		arrEmp.add(new Emp(4, "Mohan", 126000.35));
		arrEmp.add(new Emp(5, "Roshan", 2000.35));
		
		for(Emp emp:arrEmp) {
			if(emp.salary > 10000.00) {
				System.out.println("Name: "+emp.name+", Salary: "+emp.salary );
			}
		}
		
	}

}

class Emp{
	int id;
	String name;
	double salary;
	
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}