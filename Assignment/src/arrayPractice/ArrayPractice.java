package arrayPractice;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		System.out.println("how many element you want to store in an array?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Enter elements you want to store in array");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		// sorting array in ascending order
//		int temp = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] > a[j]) {
//                    temp = a[j];
//                    a[j] = a[i];
//                    a[i] = temp;
//                }
//            }
//        }
//		System.out.println(Arrays.toString(a));

		// sorting array in descending order
//        int temp1 = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] < a[j]) {
//                    temp1 = a[j];
//                    a[j] = a[i];
//                    a[i] = temp1;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));

	}

}
