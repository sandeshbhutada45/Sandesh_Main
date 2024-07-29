package Main;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Reusable.Utils;

public class PrismMain extends Utils{
	
	
	By accept= By.id("accept-button");
	By dd= By.id("dropdownlist");
	By username= By.id("username");
	By password= By.id("password");
	By btn= By.id("submit");
	By catPrism= By.id("f5c775c0-2a88-4679-ad2b-19465f3c981c");
	By caterpillar= By.xpath("(//*[contains(text(),'Caterpillar')])[2]");
	By Select= By.xpath("//*[@class='eto-btn eto-btn--primary']");
	
	
	public void actionPerfom1() {
		driver.findElement(accept).click();	
	}
	public void actionPerfom2() {
		driver.findElement(Select).click();
	}
	public void actionPerfom3() throws IOException, Exception {
		driver.findElement(username).sendKeys(getPropertiesFiles("user2"));
		driver.findElement(password).sendKeys(getPropertiesFiles("pass2"));
		driver.findElement(btn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(caterpillar).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));		
		driver.findElement(catPrism).click();
	}


	@Test
	public void process1() throws Exception {
		openBrowser("Chrome");
		driver.get(getPropertiesFiles("URL8"));
		actionPerfom1();
		getDropdownByIndex(dd,1);
		actionPerfom2();
		actionPerfom3();
		getResponseCode();
		takeScreenshot();
		getPageURL();
		writeExcel("URLS","","");
		

	}

}
