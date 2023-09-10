
public class PassByReference {

	public static void main(String[] args) {
		
		Demo3 obj1 = new Demo3(10, 7);
		
		System.out.println("Before calling method i = "+obj1.a+", j = "+obj1.b);//10 7
		obj1.display(obj1);
		System.out.println("After calling method i = "+obj1.a+", j = "+obj1.b); //14 16
		
	}

}

class Demo3{
	
	int a,b;
	
	Demo3(int i, int j) {
		a=i;
		b=j;
		System.out.println("Within constructor method i = "+i+", j = "+j); //10 7
	}
	
	void display(Demo3 obj) {
		obj.a+=4;
		obj.b+=9;
	}
	
}