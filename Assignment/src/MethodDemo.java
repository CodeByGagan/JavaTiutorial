
public class MethodDemo {

	public static void main(String[] args) {
		System.out.println("Main method with parameters String[] args");
		MethodDemo.main(1);
		main('v');
		double[] d = {};
		MethodDemo.main(d);
	}
	
	public static void main(int i) {
		System.out.println("Main method with parameters int i");
	}
	
	public static void main(char ch) {
		System.out.println("Main method with parameters char ch");
	}
	
	public static void main(double[] d) {
		System.out.println("Main method with parameters double[] d");
	}
	
}
