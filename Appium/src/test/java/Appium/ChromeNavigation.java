package Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Utils.baseEmulator;
import io.appium.java_client.android.AndroidDriver;

public class ChromeNavigation extends baseEmulator {

	AndroidDriver driver;
	baseEmulator bp= new baseEmulator();
	@Test
	public void step() throws Exception {
		driver=bp.baseMethod("Pixel1", "emulator-5554", "Android", "11", "UiAutomator2", "com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.GoogleAppTextAssistEntrypointExternal");
		driver.findElement(By.id("com.google.android.googlequicksearchbox:id/googleapp_hint_text")).sendKeys("https://www.amazon.com",Keys.ENTER);
		
	}
	
}
