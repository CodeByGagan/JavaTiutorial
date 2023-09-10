
public class CallByValue {
	public static void main(String[] args) {
		
		Demo2 obj = new Demo2();
		int i=10, j=7;
		
		System.out.println("Before calling method i = "+i+", j = "+j); //10 7
		obj.display(i, j);
		// calling by value 
		System.out.println("After calling method i = "+i+", j = "+j); //10 7
	}
	
}

class Demo2{
	void display(int i, int j) {
		i+=4;
		j+=9;
		System.out.println("Within method method i = "+i+", j = "+j); //14 16
	}
}