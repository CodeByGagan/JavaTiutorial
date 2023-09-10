package ExceptionHandeling;

public class FinallyDemo {

	public static void main(String[] args) {
		//When a finally block is defined, it is gurranted to execute, regardless of Wheather or not an exception is thrown
		int a[] = {8,9};
		try {
			int x = 9/a[2];
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
		finally {
			System.out.println("Finnaly Block");
		}
	}

}
