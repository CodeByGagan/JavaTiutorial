import java.util.Scanner;

public class Aug17Scanner {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.display();
		
	}

}
class Employee{
	static String dept = "IT";
	String name, address;
	int id;
	
	public Employee() {
		System.out.println("Enter your name.");
		Scanner sc = new Scanner(System.in);
		 this.name = sc.nextLine();
		
		System.out.println("Enter your ID.");
		Scanner scId = new Scanner(System.in);
		this.id = sc.nextInt();
		
		System.out.println("Enter your address.");
		Scanner scAddress = new Scanner(System.in);
		this.address = scAddress.nextLine();
		
	}
	void display() {
		System.out.println("Hello "+name+".\nYour Id is "+id+"\nYour Department is "+dept+"\nYour Address is "+address);
	}
}