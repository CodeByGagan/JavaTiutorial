
public class RevisionBeforeArrayList {
	
	static String name = "aaa"; //static variable
	static double bonus = 11.22;
	
	int i =8;
	
	static {
		System.out.println("this is static1");
		System.out.println(name);
//		System.out.println(bonus);
//		System.out.println(i); //static block can only access static var like static method
		
	}
	
	static {
		System.out.println("this is static2");
	}

	static void displayBonus() {
//		System.out.println(i);
		System.out.println(bonus); // 
	}
	
	public static void main(String[] args) {
		
		System.out.println("this is main method");
		
		StaticDemo ob = new StaticDemo();
		
		RevisionBeforeArrayList.displayBonus();
		
		RevisionBeforeArrayList ob1 = new RevisionBeforeArrayList();
		ob1.displayBonus();
		displayBonus();
		
	}

}

class StaticDemo{
	
	static {
		System.out.println("this is static3 ");
	}

	
}