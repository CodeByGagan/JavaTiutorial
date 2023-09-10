
public class Array {

	public static void main(String[] args) {
		
		double arr[] = new double[5]; // instatiating an arr of type double
		arr[0] = 1.00;
		arr[1] = 2.00;
		arr[2] = 3.00;
		arr[3] = 4.00;
		arr[4] = 5.00;
		
		System.out.println("Array arr lingth: "+arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Element at index "+i+" is: "+arr[i]);	
		}
		
		int a[] = {1,2,3,4};
		System.out.println("Array a lingth: "+a.length);
		//for each loop
		for(int k:a) {
			System.out.println("Element at index "+k+" is: "+a[k]);
		}
		
	}

}

