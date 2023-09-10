
public class StaticTutorial {
	public static void main(String[] args) {
		UseStatic static1 = new UseStatic();
//		System.out.println("Value of i: "+ static1.i);
//		System.out.println("Value of i: "+ UseStatic.i);
		UseStatic.display();
	}

}

// Static method can be called without creating an obj
// Static method belong to entire class not to a specific obj of class
// Static var -> unlike static method, accesible from specific obj of class
// Static method can't interact with non static instance var
// ClassName.method or ClassName.var to call static method & var
// when obj are created, no instance of static var is made

class UseStatic{
	static int i = 4;
	static int a = 9;
	static String s = "strinf";
	static int c = 9;
	int d = 10;
	
	public UseStatic() {
		{
			System.out.println("non-static block");
		}
	}
	
	//static block
	// when the class is loaded into memory, static block gets executed
	// it is executed only once
	// used for instanciate all static var
	// class can have more than one static block
	static {
		System.out.println("static block");
		 int aa = 9;
		 String ss = "string";
		 int cc = 9;
//		 d++; // static block can only access static var like static method
	}
	static {
		System.out.println("static block 2");
		int aaa = 9;
		String sss = "string";
		int ccc = 9;
//		 d++; // static block can only access static var like static method
	}
	
	static void display() {
		System.out.println();
	}
	
}
