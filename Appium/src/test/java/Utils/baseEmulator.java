package Utils;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class baseEmulator {
	AndroidDriver driver;

	public AndroidDriver baseMethod(String appPackage, String appActivity) throws Exception {

		DesiredCapabilities cp = new DesiredCapabilities();

		cp.setCapability("deviceName", "Pixel1");

		cp.setCapability("udid", "emulator-5554");

		cp.setCapability("platformName", "Android");

		cp.setCapability("platformVersion", "11");

		cp.setCapability("automationName", "UiAutomator2");

		cp.setCapability("appPackage",appPackage);

		cp.setCapability("appActivity", appActivity);

		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, cp);
		System.out.println("App is launched successfully");
		return driver;
	}
}
