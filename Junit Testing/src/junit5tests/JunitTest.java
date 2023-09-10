package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

public class JunitTest {

	@Test //annotation tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.
	@DisplayName("Adding 2 positive numbers")
	
	// we don't need main() in Junit5
	public void testMethod1() {
		Calculator calc1 = new Calculator();
		System.out.println(calc1.add(1,2));
	}
	
	@Test
	@DisplayName("Adding 2 negative numbers")
	@Disabled("Write here reason for making it disabled")
	public void testMethod2() {
		Calculator calc2 = new Calculator();
		System.out.println(calc2.add(-9,-2));
	}
	
//	@Test // can't add @Test annottion before private method
//	private void testMethod3() {
//		Calculator calc3 = new Calculator();
//		System.out.println(calc3.add(-9,2));
//	}

}
