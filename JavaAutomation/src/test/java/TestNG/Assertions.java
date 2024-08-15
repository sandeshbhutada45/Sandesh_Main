package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	@Test
	public void test1() {
		System.out.println("Open Browser");
		assertEquals("True", "True"); // Hard Asseration
		System.out.println("Close Broswer");
	}

	@Test
	public void test2() {
		System.out.println("Open Browser");
		SoftAssert sa = new SoftAssert(); // Soft Asseration
		sa.assertEquals("True", "false");
		System.out.println("Close Broswer");
		System.out.println("Open Browser");
		sa.assertAll();
	}
}
