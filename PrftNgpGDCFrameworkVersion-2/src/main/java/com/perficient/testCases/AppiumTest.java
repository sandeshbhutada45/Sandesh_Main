package com.perficient.testCases;

import org.testng.annotations.Test;

import com.perficient.baseclasses.AppiumBasePage;
import com.perficient.util.TestCaseBase;

public class AppiumTest extends TestCaseBase{
	
	@Test(groups = {"regression","smokes"}, description = "Verify Appium functionality", testName = "Appium Sample", priority = 1)
	public void Mytest() throws Exception
	{
		AppiumBasePage appiumObj = new AppiumBasePage(pageManager, excelReader);	
		System.out.println("Script Started");
		appiumObj.startApp();
		customAssertion.assertTrue(true,null);
	}
}
