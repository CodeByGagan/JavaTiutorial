//Points to Remember
//•	We use the abstract keyword to create abstract classes and methods.
//•	An abstract method doesn't have any implementation (method body).
//•	A class containing abstract methods should also be abstract.
//•	We cannot create objects of an abstract class.
//•	To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
//•	Abstract class can have a non abstract method
//•	A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
//•	We can access the static attributes and methods of an abstract class using the reference of the abstract class.

import java.util.Scanner;

public class AbstractDemo {

	public static void main(String[] args) {
		
		//Atm atm = new Atm();//we can't create an obj of abstract class
//		Atm atm; // we can create a reference of abstract class
//		atm = new AtmMachine();
//		atm.checkBalance();
//		atm.depositeAmount();
//		atm.withdrawalAmount();
		
		Atm2 atm2 = new Atm2();
		atm2.checkBalance();
		atm2.depositeAmount();
		atm2.withdrawalAmount();
		
	}

}

abstract class Atm{
	// abstract method must be within an abstract class
	double balance = 5000.00;
	abstract void checkBalance(); //abstract method don't have body
	abstract void withdrawalAmount();
	abstract void depositeAmount();
	void calculate() {
		System.out.println("non abstract method"); //abstract class can have non abstract method
	}
	
}

class Atm1 extends Atm{
	@Override
	void checkBalance() {
		System.out.println("Current balance is: "+balance);
	}

	@Override
	void withdrawalAmount() {
		System.out.println("Enter the amount you want to withdraw");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println("Your account is debited with the amount: "+d);
		balance -= d;
		System.out.println("Current balance is: "+balance);
	}

	@Override
	void depositeAmount() {
		System.out.println("Enter the amount you want to deposite");
		Scanner sc1 = new Scanner(System.in);
		double d1 = sc1.nextDouble();
		System.out.println("Your account is credited with the amount: "+d1);
		balance += d1;
		System.out.println("Current balance is: "+balance);
	} 
	
}

class Atm2 extends Atm1{
	
}

class AtmMachine extends Atm{//sub class extending abstract class must override all the parent methods
	
	@Override
	void checkBalance() {
		System.out.println("Current balance is: "+balance);
	}

	@Override
	void withdrawalAmount() {
		System.out.println("Enter the amount you want to withdraw");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println("Your account is debited with the amount: "+d);
		balance -= d;
		System.out.println("Current balance is: "+balance);
	}

	@Override
	void depositeAmount() {
		System.out.println("Enter the amount you want to deposite");
		Scanner sc1 = new Scanner(System.in);
		double d1 = sc1.nextDouble();
		System.out.println("Your account is credited with the amount: "+d1);
		balance += d1;
		System.out.println("Current balance is: "+balance);
	} 
	
}