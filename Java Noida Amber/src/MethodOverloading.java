
public class MethodOverloading {

	public static void main(String[] args) {
		Demo1 ob = new Demo1();
		ob.test(1f);
//		ob.test();
//		ob.test(2.0, 7, 8);
//		ob.test(25.2f, 15.6f);
//		ob.test(1, 4, 6);
	}

}
// method overloading is compile time polymorphism
class Demo1{
	
	void test() {
		System.out.println("No parameters");
	}
	void test(int a) {
		System.out.println("1 parameters int ");
	}
	void test(double a) {
		System.out.println("1 parameters double");
	}
	void test(float a, float b) {
		float c=(a+b);
//		String str = Float.toString(c);
		String formattedString = String.format("%.02f", c);
		System.out.println("2 parameters"+formattedString);
	}
	void test(int a, int b, int c) {
		System.out.println("3 parameters all int");
	}
	void test(double a, int b, int c) {
		System.out.println("3 parameters 2 int and 1 double");
	}
	
}