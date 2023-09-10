
public class FinalDemo {

	public static void main(String[] args) {

		final int i = 3; //final mean constant (can't reassign)
		
		
	}

}

abstract class DemoFinal{
//	abstract final void display1();
	final void display() { // final method prevents overriding
		System.out.println("Hello Java");
	}
}

class DemoFinal1 extends DemoFinal{
//	void display() {} // will show error
}

final class DemoFinal2{
	int j = 9;
	int square(int i) {
		return i*i;
	}
}

//class DemoFinal3 extends DemoFinal2{ 
//	//Error: The type DemoFinal3 cannot subclass the final class DemoFinal2(Final class prevemts inheritence)
//}