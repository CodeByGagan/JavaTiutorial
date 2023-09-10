
public class MultipleInheritence {

	public static void main(String[] args) {

	}

}

class Father{
	void communicate() {
		System.out.println("Father");
	}
}

class Mother{
	void communicate() {
		System.out.println("Mother");
	}
}

//multiple inheritence is not directly supported
//class Child extends Father, Mother{
//	void communicate() {
//		System.out.println("Child");
//	}
//}