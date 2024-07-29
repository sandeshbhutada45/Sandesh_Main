package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import Reusable.Utils;

public class LoginPage extends Utils {
	Utils UT = new Utils();
	By username = By.id("user-name");
	By password = By.id("password");
	By btn = By.id("login-button");

	public void step()
	
	{
		UT.tearDown();
	}

	public void step1() throws IOException {
		UT.openBrowser("Chrome");
		String url = UT.getPropertiesFiles("URL4");
		System.out.println("URL:" + url);
		driver.navigate().to(url);
	}
	public void step2() throws IOException {
		driver.findElement(username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(btn).click();
		getPageURL();
		
	
	}

	
	public void step3() throws IOException {
		UT.takeScreenshot();
	}
}
