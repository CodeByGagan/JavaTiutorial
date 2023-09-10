
public class ThisTest {

	public static void main(String[] args) {
		UseOfThis this1 = new UseOfThis();
		this1.method1();
	}

}

class UseOfThis{
	
	public UseOfThis() {
		
	}
	
	public void method1() {
		this.method2();// here this is used to call current class method
		System.out.println("This is method 1");
	}
	
	public void method2() {
		System.out.println("This is method 2");
	}
	
}
