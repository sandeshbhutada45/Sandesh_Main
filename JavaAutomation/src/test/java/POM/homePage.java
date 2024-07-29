package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

	WebDriver driver;

	public homePage(WebDriver driver) {
		this.driver = driver;
	}

	By logo = By.xpath("//div[@class=\"app_logo\"]");

	public String getTextFromLogo() {

		return driver.findElement(logo).getText();
	}

}
