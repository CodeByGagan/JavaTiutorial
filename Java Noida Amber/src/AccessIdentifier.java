
public class AccessIdentifier {

	public static void main(String[] args) {
		Test2 obj=new Test2();
		System.out.println("X: "+obj.x);
//		System.out.println("Password: "+obj.password); // password not visible here
		obj.display();
	}

}
class Test2{
	// access identifier is for encapsulation/security
	// public members are accessible from anywhere
	public int x=32;
	public int y=23;
	// private members(var/method) are only accessible within class where it has been declared
	private String password="*****";
	
	void display() {
		System.out.println("Password: "+password);
	}
}