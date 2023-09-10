
public class PracticeSuper {

int i,j;
	
	void sum() {
		System.out.println("Sum method");
		show();
	}
	
	 void show() {
		System.out.println("Show method");
	}
	
	public static void main(String[] args) {
//		sum(); //we can not call non-static member in static method
//		(Cannot make a static reference to the non-static method sum() from the type PracticeSuper)
//		non-static method can access static members
	}

}

class Test1{
	
	int i,j;
	
	void sum() {
		System.out.println("Sum method");
		show();
	}
	
	void show() {
		System.out.println("Show method");
	}
}