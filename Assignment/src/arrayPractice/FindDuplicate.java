package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {

		System.out.println("how many element you want to store in an array?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter elements you want to store in array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Your array is: "+Arrays.toString(arr));

		// Searches for duplicate element
		System.out.print("Duplicate elements in array are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[j]+" ");

			}

		}
	}

}
