
public class SuperDemo1 {

	public static void main(String[] args) {
		Q q1 = new Q(1,2);
		q1.show();
	}

}

class P{
	int i;
}

class Q extends P{
	int i; // this 'i' hides the 'i' in superclass 'P'
	public Q(int a, int b) {
		super.i = a; //accessing superclass i
		i = b; //subclass i
	}
	
	void show() {
		System.out.println("Super class i: "+super.i+"\nSubclass i: "+i);
	}
}