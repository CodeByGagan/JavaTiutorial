
public class MultipleInheritence1 {

	public static void main(String[] args) {
		
		Shape1 s = new Rectangle1();
		s.display();
		
		TwoDShape1 s2 = new Rectangle1();
		s2.display1();
		
	}

}

interface Shape1{
	void display();
}

interface TwoDShape1{
	void display1();
}

class Rectangle1 implements Shape1, TwoDShape1{
	
	public void display() {
		System.out.println("Display Method of Rectangle Class");
	}
	public void display1() {
		System.out.println("Display1 Method of Rectangle Class");
	}
	
}