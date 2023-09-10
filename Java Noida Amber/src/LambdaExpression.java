
public class LambdaExpression {
	
	public static void main(String[] args) {	
		
		Lambda1 l1;
		l1 = new Lambda2(); 
		l1.display();
		
	}

}

interface Lambda1 {
	
	void display();
	
}

class Lambda2 implements Lambda1{

	@Override
	public void display() {
		System.out.println("Hello Lambda");
	}
	
}