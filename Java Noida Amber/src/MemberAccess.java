
public class MemberAccess {

	public static void main(String[] args) {
		B b1 = new B();
		b1.setValue(5, 87);
		b1.add();
	}

}

//public and protected members are accessible by a subclass
// private members are not accessible by a subclass, they are only visible within the class
class A {
	int i;  //default access specifier (public by default)
	private int j; //j is only accesible within class A
	protected int k; 
	
	void setValue(int i, int k) {
		this.i = i;
		this.k = k;
	}
}

class B extends A{
	int total;
	void add() {
		total = i+k;
		System.out.println("Total: "+total);
		
	}
}