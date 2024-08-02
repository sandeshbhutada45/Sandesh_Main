package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	/*
	 *
	 * Before Suite Before Test Before Class Before Method Test 1 After Method After
	 * Class After Test
	 */
	@BeforeSuite
	public void beforeS() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeT() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeC() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeM() {
		System.out.println("Before Method");
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@AfterMethod
	public void afterM() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterC() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterT() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterS() {
		System.out.println("After Suite");
	}

}
