import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Your name is "+name);
		
		System.out.println("Enter your age");
		Scanner scage = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Your age is "+age);
		
		System.out.println("Enter your Salary");
		Scanner scsalary = new Scanner(System.in);
		double salary = sc.nextDouble();
		System.out.println("Your salary is "+salary);
	}

}
