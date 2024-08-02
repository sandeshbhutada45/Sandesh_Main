package TestNG;

import org.testng.annotations.Test;

public class RunTest_N_times {

	@Test(invocationCount = 10) //Run 10 Times
	public void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum======="+c);
	}
}
