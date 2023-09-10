package Package1;

public class Access2 {

	public static void main(String[] args) {
		
		Access1 acs1 = new Access1();
		System.out.println(acs1.hrs);
//		System.out.println(acs1.password); // Private members are only accessible within same class
		System.out.println(acs1.id); //protected members are accessble outside class withing same pkg
	}

}
