package junit5tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

public class BeforeAfterAnnotationTest {
	

	Calculator calc;
	
//	can be placed anywhere don't follow any particular 
//	@BeforeEach
//	public void init() {
//		calc = new Calculator();
//		System.out.println("Initialising calculator instance");
//	}

	@AfterEach
	public void afterInit() {
		System.out.println("");
	}
	
	@Test
	@DisplayName("Adding 2 positive numbers")
	public void testMethod1() {
		System.out.println(calc.add(1,2));
	}
	
	@BeforeEach
	public void init() {
		calc = new Calculator();
		System.out.println("Initialising calculator instance");
	}
	
	@Test
	@DisplayName("Adding 2 negative numbers")
	public void testMethod2() {
		System.out.println(calc.add(-1,-2));
	}
	
	@Test
	@BeforeAll()
	public static void testMethod3(){
		System.out.println("Before all 1");
	}
	
	@Test
	@BeforeAll()
	public static void testMethod4(){
		System.out.println("Before all 2");
	}
	
	
	@Test
	@AfterAll()
	public static void testMethod5(){
		System.out.println("After all 1");
	}
	
	@Test
	@AfterAll()
	public static void testMethod6(){
		System.out.println("After all 2");
	}
	
	
	
	
	
}
