package Practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAftertestcases {
	
	@Test
	public static void testcase() {
		System.out.println("this is testt case 1");
		
	}
	
	@Test
	public static void atestcase() {
		System.out.println("this is alpha case");
	}
	
	@BeforeTest
	public static void beforetest() {
		
		System.out.println("this is before test");
	}
	
	@BeforeMethod
	public static void beforemethod() {
		System.out.println("this is before method");
	}
	
	@BeforeSuite
	public static void beforesuit() {
		System.out.println("this is before suite");
	}

}
