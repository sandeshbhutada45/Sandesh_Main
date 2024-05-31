package com.perficient.baseclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.perficient.util.ExcelReader;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;

public class AppiumBasePage extends PageObject {
	public AppiumBasePage(PageManager pm, ExcelReader xl) {
		super(pm, xl);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//android.widget.Button[contains(@resource-id,'digit_1')]")
	public WebElement oneBt_Xpath;
	@FindBy(xpath = "//android.widget.Button[contains(@resource-id,'op_add')]")
	public WebElement addBt_Xpath;
	@FindBy(xpath = "//android.widget.Button[contains(@resource-id,'digit_4')]")
	public WebElement one1Bt_Xpath;
	@FindBy(xpath = "//android.widget.Button[contains(@resource-id,'eq')]")
	public WebElement equalBt_Xpath;
	
		
	public void startApp() throws Exception {
		pageManager.clickByAction(oneBt_Xpath);
		pageManager.sleep(2000);
		pageManager.clickByAction(addBt_Xpath);
		pageManager.sleep(2000);
		pageManager.clickByAction(one1Bt_Xpath);
		pageManager.sleep(2000);
		pageManager.clickByAction(equalBt_Xpath);
		pageManager.sleep(2000);
		System.out.println("Script RUnning");
		
	}
}
