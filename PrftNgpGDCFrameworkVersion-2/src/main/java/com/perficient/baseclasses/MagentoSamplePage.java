package com.perficient.baseclasses;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.perficient.util.ExcelReader;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;
import com.perficient.util.SystemUtil;
import com.perficient.util.TestData;

/*
 * This class supports Selenium 4 features - Relative locators 
 * */

public class MagentoSamplePage extends PageObject{
	protected WebDriver driver;

	public static String HOMEPAGETITLE = "Home Page";
	
	Properties magentoLocators = SystemUtil.loadPropertiesResources("/testdata_MagentoSampleTest.properties");

	String shopCTA = magentoLocators.getProperty("HomePage.shopCTA.Xpath");
	String title = magentoLocators.getProperty("HomePage.text.Xpath"); 
	String styleCTA = magentoLocators.getProperty("CollectionPage.style.Xpath"); 
	String categoryCTA = magentoLocators.getProperty("CollectionPage.category.Xpath");
	String sortByText = magentoLocators.getProperty("CollectionPage.sortBy.Css");
	String options = magentoLocators.getProperty("CollectionPage.options.Css");
	String collectionText = magentoLocators.getProperty("CollectionPage.category.Css"); 
	String homeLink = magentoLocators.getProperty("CollectionPage.homeLink.Xpath");
	
	
	@FindBy(xpath = "//span[text()='Allow Cookies']")
	public WebElement clickCookieCTA;
	
	public MagentoSamplePage(PageManager pm, ExcelReader excelReader) {
		super(pm, excelReader);
	}

	public boolean titleContains(String title) {
		return pageManager.getTitle().contains(title);
	}
	
	/* 
	 * This method will open the Magento Home page
	 * */
	public void open(String url) {
		pageManager.navigate(url);
		pageManager.waitForPageLoaded();
		pageManager.waitForSeconds(3000);
		pageManager.click(clickCookieCTA);
		
	}

	/*
	 * This method will click on Shop CTA on Home page
	 * */
	public void clickOnShopCTA() {
		pageManager.belowElementClick(By.xpath(shopCTA), By.xpath(title));
		pageManager.waitForPageLoad();
		pageManager.implicitWait();
	}
	
	/*
	 * This method will click on Style dropdowm
	 * */
	public void clickOnStypeDropDown() {
		pageManager.aboveElementClick(By.xpath(styleCTA), By.xpath(categoryCTA));
		pageManager.waitForPageLoad();
		pageManager.implicitWait();

	}
	
	/*
	 * This method will select the options from Sort By
	 * */
	public void clickOnOptions() {
		pageManager.rightElementClick(By.cssSelector(options), By.cssSelector(sortByText));
		pageManager.waitForPageLoad();
		pageManager.implicitWait();

	}
	
	/* 
	 * This method will redirect to home page
	 * */
	public void goToHomePage() {
		pageManager.leftElementClick(By.xpath(homeLink), By.cssSelector(collectionText));
		pageManager.waitForPageLoad();
		pageManager.implicitWait();
	}
		
}
