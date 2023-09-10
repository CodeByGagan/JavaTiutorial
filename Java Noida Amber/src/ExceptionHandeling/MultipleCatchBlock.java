package ExceptionHandeling;

import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		try {
			System.out.println("Enter divisor");
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();
			int i = 9/j;
			int c[] = {23,1,5,3,8};
			c[9] = 98;
		}//catch (Exception e) {}//universal exception handler , can't used before other exception handler
//		catch(ArithmeticException e){
//			System.out.println("Error: "+e);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Error: "+e);
//		}
		catch (Exception e) {
			System.out.println("Error: "+e);//universal exception handler
		}
		
		
	}

}
