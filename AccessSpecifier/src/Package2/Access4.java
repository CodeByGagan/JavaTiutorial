package Package2;

import Package1.Access1;

public class Access4 extends Access1 {

	public static void main(String[] args) {

		Access4 acs1 = new Access4();
		System.out.println(acs1.id); // protected members are accessible outside pkg by using subClass
		
	}

}
