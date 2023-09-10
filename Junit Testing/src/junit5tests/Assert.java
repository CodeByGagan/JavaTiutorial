package junit5tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class Assert {

	 @Test
	 @Timeout(1) //in seconds
	    void testCase0() throws InterruptedException {
		 Thread.sleep(1); // in milliseconds
	        System.out.println("Timeout is 1000");
	    }
	 
	 @Test
	 void testCase1() {
		 assertEquals(2, 1 + 1);
		 System.out.println("TestCase1");
	 }

	 @Test
	    void testCase2() {
	        assertEquals(5, 2 + 2); // This will fail
	    } 
	    
	 @Test
	    void testCase3() {
	        int[] expected = {1, 2, 3};
	        int[] actual = {1, 2, 3};
	        assertArrayEquals(expected, actual);
	    }
	    
	 @Test
	    void testCase4() {
	    	int[] expected = {1, 2, 3};
	    	int[] actual = {1, 2, 1};
	    	assertArrayEquals(expected, actual); // This will fail
	    }
	
}
