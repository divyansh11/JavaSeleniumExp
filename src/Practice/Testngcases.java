package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngcases {
	
	@Test
	public static void testcase1() {
		String a="divyansh";
		String b="divyansh";
		
		Assert.assertEquals(a, b);
	}

}
