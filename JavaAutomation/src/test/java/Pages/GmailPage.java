package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailPage {

	WebDriver driver;
	WebDriverWait wait;

	public GmailPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	By gmail= By.id("identifierId");
	By next= By.xpath("//*[contains(text(), 'Next')]");
	By pass= By.name("Passwd");
	
	public void step1() {
		driver.findElement(gmail).sendKeys("sandeshsb45@gmail.com");
		driver.findElement(next).click();
	}
	public void step2() {
		wait.until(ExpectedConditions.elementToBeClickable(pass)).sendKeys("Sandesh#@45");
		driver.findElement(next).click();
	}
	

}
