package Utils;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class baseEmulator {
	AndroidDriver driver;

	public AndroidDriver baseMethod(String deviceName, String UDID, String platformName, String platformVersion,
			String automationName, String appPackage, String appActivity) throws Exception {

		DesiredCapabilities cp = new DesiredCapabilities();

		cp.setCapability("deviceName", deviceName);

		cp.setCapability("udid", UDID);

		cp.setCapability("platformName", platformName);

		cp.setCapability("platformVersion", platformVersion);

		cp.setCapability("automationName", automationName);

		cp.setCapability("appPackage", appPackage);

		cp.setCapability("appActivity", appActivity);

		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, cp);
		System.out.println("App is launched successfully");
		return driver;
	}
}
