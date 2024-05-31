package com.perficient.baseclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.perficient.util.RestAPIUtility;
import com.perficient.util.CustomAssertion;
import com.perficient.util.ExcelReader;
//import com.perficient.insite.basepages.InsiteSignInPage;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;

public class MagentoSignInPage extends PageObject {
	public static String SIGNINTITLE = "Customer Login";
	public static String HOMEPAGETITLE = "Home Page";
	public static String MYACCOUNTTITLE = "My Account";

	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	public WebElement clickSignIn;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@id='send2']")
	public WebElement signInButton;


	public MagentoSignInPage(PageManager pageManager, ExcelReader excelReader, CustomAssertion customAssertion,
			RestAPIUtility restApiutility) {
		// TODO Auto-generated constructor stub
		super(pageManager, excelReader, customAssertion, restApiutility);
	}

	public boolean titleContains(String title) {

		return pageManager.getTitle().contains(title);
	}
	
	public void open(String url) {
		pageManager.navigate(url);
	}

	public void clickOnSignIn() {
		pageManager.click(clickSignIn);
	}
	
	public void navigateToSignInPage(String navigateToSignInPage) {
		pageManager.navigate(navigateToSignInPage);
	}
	
	public void signIn(String usr, String pwd) throws InterruptedException {
		pageManager.sendKeys(userName, usr);
		pageManager.sendKeys(password, pwd);
		pageManager.sleep(3000);
		pageManager.clickByJavaScriptExecutor(signInButton);	
	}
}
