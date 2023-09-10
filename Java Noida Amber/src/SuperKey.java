import java.util.Scanner;

public class SuperKey {

	public static void main(String[] args) {
		
		System.out.println("Enter your Account number");
		Scanner sc = new Scanner(System.in);
		int accountNo = sc.nextInt();
		
		System.out.println("Enter your Name");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		
		System.out.println("Enter your Salary");
		Scanner sc2 = new Scanner(System.in);
		double balance = sc2.nextDouble();
		
		Employee2 emp = new Employee2(accountNo, name, balance);
		emp.show();
	}

}

//super has two basic use
// 1. to call superclass constructor
// 2. to access superclass members
class Account{
	
	int accountNo;
	String name;
	
	public Account(int accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
	}
}

class Employee2 extends Account{
	
	double balance;
	
	public Employee2(int accountNo, String name, double balance) {
//		System.out.println("Subclass constructor"); //this will throw error: calling super class constrctor should be the first statement within subclass
		super(accountNo, name); //calling a super class constructor
		this.balance = balance;
	}
	void show() {
		System.out.println("Name: "+name+", Account No: "+accountNo+", Balance: "+balance);
	}
}