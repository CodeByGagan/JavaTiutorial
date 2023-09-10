package arrayPractice;
import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {
		
		System.out.println("how many element you want to store in an array?");
		Scanner sc1 = new Scanner(System.in);
		
		int a[] = new int[sc1.nextInt()];
		int sum = 0;
		System.out.println("Enter elements you want to store in array");
		
		for(int i=0; i<a.length; i++) {
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		System.out.println("sum is: "+sum);
		System.out.println("average is: "+(double)sum/a.length);
	
	}

}
