package com.perficient.testCases;

import com.perficient.baseclasses.MagentoSignInPage;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;
import org.testng.annotations.Test;

public class SampleSignInWeb extends TestCaseBase {

	@Test(groups = {"regression","smokes"}, description = "Verify Magento URL is opened", testName = "Wired Magento Pages", priority = 1)
	public void openURL()  {

		String url = TestData.get("url");
		
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage(pageManager, excelReader, customAssertion, restApiutility);
		magentoSignInPage.open(url);
		customAssertion.assertTrue(pageManager.getTitle().contains(MagentoSignInPage.HOMEPAGETITLE),null);
	}
	
	@Test(groups = {"regression","smokes"}, description = "Verify Magento Sign In button is clicked", testName = "Wired Magento Pages", priority = 2)
	public void signInButton()  {
		
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage(pageManager, excelReader, customAssertion, restApiutility);
		magentoSignInPage.clickOnSignIn();
		customAssertion.assertTrue(pageManager.getTitle().contains(MagentoSignInPage.SIGNINTITLE),null);
	}
	
	@Test(groups = {"regression","smokes"}, description = "Verify User is signed in", testName = "Wired Magento Pages", priority = 3)
	public void signIn() throws InterruptedException  {
		
		String username = TestData.get("username");
		String password = TestData.get("password");
		
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage(pageManager, excelReader, customAssertion, restApiutility);
		magentoSignInPage.signIn(username, password);
		customAssertion.assertTrue(pageManager.getTitle().contains(MagentoSignInPage.HOMEPAGETITLE), null);
	}
}
