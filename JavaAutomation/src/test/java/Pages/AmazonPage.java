package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPage {

	WebDriver driver;
	WebDriverWait wait;
	By searchBox = By.id("twotabsearchtextbox");
	By addCart = By.xpath("(//button[text()='Add to cart'])[1]");
	By goToCart = By.xpath("//a[@href='/cart?ref_=ewc_gtc']");
	By checkOut= By.xpath("//*[@value='Proceed to checkout']");

	public AmazonPage(WebDriver driver) {
		this.driver = driver;
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void step1() {
		wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys("Oneplus Earphone", Keys.ENTER);
	}

	public void step2() {
		driver.findElement(addCart).click();
		wait.until(ExpectedConditions.elementToBeClickable(goToCart)).click();
	}
	
	public void step3() {
		wait.until(ExpectedConditions.elementToBeClickable(checkOut)).click();
	}
}
