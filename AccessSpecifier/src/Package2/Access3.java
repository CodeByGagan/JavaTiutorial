package Package2;

import Package1.Access1;

public class Access3 {

	public static void main(String[] args) {

		Access1 acs1 = new Access1();
//		System.out.println(acs1.hrs); // default members can not be accesible outside pkg 
		System.out.println(acs1.sec); // public members can be accesible outside pkg 
//		System.out.println(acs1.id); //protected members are not accessble outside pkg
		
	}

}
