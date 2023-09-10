import java.util.ArrayList;

public class LambdaExpression2 {

	public static void main(String[] args) {
		
		Lambda3 l2 = () -> System.out.println("This is lambda expression");
		l2.display();
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
	    arrL.add(1);
	    arrL.add(2);
	    arrL.add(3);
	    arrL.add(4);
	    arrL.add(5);
	    arrL.add(6);
	    arrL.add(7);
	    arrL.add(9);
	    
	    System.out.println(arrL);
		
	    arrL.forEach(n->System.out.println(n));
	    
	    System.out.println("Odd number");
	    arrL.forEach(n->{
	    	if(n%2 != 0)
	    		System.out.println(n);
	    });
	}

}

// it is a functional interface (only one abstract method)
// lambda expression can only implemented on functional interface (limitation)
interface Lambda3 {
	
	void display();
	
}