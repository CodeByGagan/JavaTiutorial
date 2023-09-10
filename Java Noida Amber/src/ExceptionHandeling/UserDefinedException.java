package ExceptionHandeling;

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			double z=5/1000;
			if(z<0.01) {
				//userDefined exception (using throw keyword)
				throw new TestException("Number is to small");
			}
		}catch(Exception e) {
			System.out.println("Error: "+e);
			System.out.println(e.getMessage());
		}
	}

}

class TestException extends Exception{
	public TestException(String msg) {
		super(msg);
	}
}