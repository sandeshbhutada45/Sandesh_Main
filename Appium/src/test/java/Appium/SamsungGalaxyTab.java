package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SamsungGalaxyTab {

	public static void main(String[] args) throws Exception {
		AndroidDriver driver;
		DesiredCapabilities cp = new DesiredCapabilities();

		cp.setCapability("deviceName", "Galaxy Tab S8 Ultra");

		cp.setCapability("udid", "localhost:55705");

		cp.setCapability("platformName", "Android");

		cp.setCapability("platformVersion", "13");

		cp.setCapability("automationName", "UiAutomator2");

//		cp.setCapability("appPackage", "com.mysugr.android.companion");
//
//		cp.setCapability("appActivity", "com.mysugr.logbook.product.LogbookProductActivity");
		
		cp.setCapability(MobileCapabilityType.APP, "C:\\Users\\sandesh.bhutada\\Downloads\\mysugr.apk");
		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, cp);
		System.out.println("App is launched successfully");
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
