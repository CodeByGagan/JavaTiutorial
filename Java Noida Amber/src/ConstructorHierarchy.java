
public class ConstructorHierarchy {

	public static void main(String[] args) {
		//in inheritence constructor are executed in the order of derivation
		C1 c1 = new C1();
	}

}

class A1{
	A1(){
		System.out.println("Class A constructor");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("Class B constructor");
	}
}

class C1 extends B1{
	C1(){
		System.out.println("Class C constructor");
	}
}