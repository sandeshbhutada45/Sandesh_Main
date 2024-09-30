package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class RealDevice {

	public static void main(String[] args) throws Exception {
		AndroidDriver driver;
		DesiredCapabilities cp = new DesiredCapabilities();

		cp.setCapability("deviceName", "Redmi 5G");

		cp.setCapability("udid", "64a947e358c6");

		cp.setCapability("platformName", "Android");

//		cp.setCapability("platformVersion", "14.0.7");

		cp.setCapability("automationName", "UiAutomator2");

//		cp.setCapability("appPackage", "com.mysugr.android.companion");
//
//		cp.setCapability("appActivity", "com.mysugr.logbook.product.LogbookProductActivity");
		
		
		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, cp);
		System.out.println("App is launched successfully");

	}

}
