package ExceptionHandeling;

public class CheckedException {
	
	//throw -- UserDefined exception
	//throws -- if a method is capable of causing an exception that can't handle
	
	static int divide(int a, int b) throws ArithmeticException{ // throws ArithmeticException it will help to other developer that this can throw an error, so that caller of method can guard against excption
		//checked Exception should include all throws list
		int result=a/b;
		return result;
	}
	
	public static void main(String[] args) {
		try {
		int c = divide(7,0);
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
