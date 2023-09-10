
public class Interface {

	public static void main(String[] args) {
		
//		Vehicle v1 = new Vehicle(); // can not instantiate an interface
		Vehicle v = new Bus(); // we can assign a class obj to an interface reference
		v.method1();
		v.method1(42);
		
		v = new Car();
		v.method1();
		v.method1(24);
	}

}

interface Vehicle{
	// by default all the methods of interface are abstract
	void method1();
	void method1(int i);
	float pi = 3.14f;
}

// class always implements interface
// a class implementing an interface must override all the abstract method of implementing interface
// all the variable and method of interface are by default public
class Bus implements Vehicle{
	
	public void method1() {
		System.out.println("Method of bus class");
	}
	public void method1(int i) {
		System.out.println("Method of bus class with parameter");	
	}
}

class Car implements Vehicle{
	
	public void method1() {
		System.out.println("Method of car class");
	}
	public void method1(int i) {
		System.out.println("Method of car class with parameter");	
	}
}