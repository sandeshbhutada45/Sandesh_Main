package Appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utils.baseEmulator;
import io.appium.java_client.android.AndroidDriver;

public class mainEmulator extends baseEmulator {

	AndroidDriver driver;
	baseEmulator be= new baseEmulator();
	
	@Test
	public void step() throws Exception {
		driver = be.baseMethod("com.mysugr.android.companion","com.mysugr.logbook.product.LogbookProductActivity");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.mysugr.android.companion:id/getStartedButton"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.mysugr.android.companion:id/mySugrLoginButton"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.mysugr.android.companion:id/emailEditText"))).sendKeys("sandeshwork99@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.mysugr.android.companion:id/button"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.mysugr.android.companion:id/passwordEditText"))).sendKeys("Sandesh@45");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.mysugr.android.companion:id/button"))).click();
		System.out.println("App is Open successfully");
	}
}
