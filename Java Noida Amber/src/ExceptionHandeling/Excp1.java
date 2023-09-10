package ExceptionHandeling;

public class Excp1 {

	public static void main(String[] args) {
		//exception is a run time error
		//exception will abnormally stops the flow of your programme
		
		try {
			int i = 9/0;
			System.out.println(i);
			System.out.println("I will be never execcute");
		}
	
		//exception can be handeled by using
			// 1. try-catch block (not a method, so we can't say we call it)
			// 2. try-finally block (not a method, so we can't say we call it)
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Exception has occured");
		int x=78/2;
		System.out.println(x);
		
	}

}
