package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripPage {

	WebDriver driver;
	WebDriverWait wait;

	By close = By.xpath("//*[starts-with(@class, 'common')]");
	By fromCity = By.id("fromCity");
	By toCity = By.id("toCity");
	By fromTextField = By.xpath("//input[starts-with(@placeholder,'From')]");
	By fromTextSelect = By.xpath("//*[text()='Nagpur']");
	By toTextField = By.xpath("//input[starts-with(@placeholder,'To')]");
	By toTextSelect = By.xpath("//*[text()='Hyderabad']");
	By date = By.xpath("//*[contains(@aria-label,'Thu Sep 26 2024')]");
	By searchBtn = By.xpath("//*[text()='Search']");

	public MakeMyTripPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void step1() {
		wait.until(ExpectedConditions.elementToBeClickable(close)).click();
	}

	public void step2() {
		wait.until(ExpectedConditions.elementToBeClickable(fromCity)).click();
		wait.until(ExpectedConditions.elementToBeClickable(fromTextField)).sendKeys("Nagpur");
		wait.until(ExpectedConditions.elementToBeClickable(fromTextSelect)).click();

	}

	public void step3() {
		wait.until(ExpectedConditions.elementToBeClickable(toCity)).click();
		wait.until(ExpectedConditions.elementToBeClickable(toTextField)).sendKeys("Hyderbad");
		wait.until(ExpectedConditions.elementToBeClickable(toTextSelect)).click();
	}

	public void step4() {
		wait.until(ExpectedConditions.elementToBeClickable(date)).click();
	}

	public void step5() {
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
	}
}
