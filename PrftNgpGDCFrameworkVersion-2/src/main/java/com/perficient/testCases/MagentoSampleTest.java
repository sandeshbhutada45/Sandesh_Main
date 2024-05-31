package com.perficient.testCases;


import org.testng.annotations.Test;
import com.perficient.baseclasses.MagentoSamplePage;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;

public class MagentoSampleTest extends TestCaseBase{
	@Test(groups = {"regression","smokes"}, description = "Verify Magento Site", testName = "Wired Magento Pages", priority = 1)
	public void homePage() throws Exception {

		String url = TestData.get("url");
	
		MagentoSamplePage magentoSamplePage = new MagentoSamplePage(pageManager, excelReader);
		magentoSamplePage.open(url);
		pageManager.waitForSeconds(2000);
		customAssertion.assertTrue(pageManager.getTitle().contains(MagentoSamplePage.HOMEPAGETITLE),null);	
		
		magentoSamplePage.clickOnShopCTA(); 
		magentoSamplePage.clickOnStypeDropDown();
		magentoSamplePage.clickOnOptions(); 
		magentoSamplePage.goToHomePage();
		
	
	}
}
