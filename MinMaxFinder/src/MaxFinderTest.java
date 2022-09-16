import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author jeena
 *
 */
class MaxFinderTest {

	@Test
	void testIntArray() {
		int[] x= {23,45,12,3,78};
		assertEquals(MaxFinder.findMaxElem(x),78,"Integer arrays work");
		//fail("Not yet implemented");
		
	}
	@Test
	void testStringArray() {
		String[] s= {"arc","apple","about"};
		assertEquals(MaxFinder.findMaxElem(s),"arc","String arrays work");
	}
	
	

}
