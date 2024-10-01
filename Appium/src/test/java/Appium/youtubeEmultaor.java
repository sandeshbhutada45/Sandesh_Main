package Appium;

import org.testng.annotations.Test;

import Utils.baseEmulator;
import io.appium.java_client.android.AndroidDriver;

public class youtubeEmultaor extends baseEmulator {

	AndroidDriver driver;
	baseEmulator bp= new baseEmulator();
	@Test
	public void run() throws Exception {
		driver = bp.baseMethod("Pixel1", "emulator-5554", "Android", "11", "UiAutomator2",
				"com.android.dialer", "com.android.dialer.main.impl.MainActivity");
		System.out.println("Dialer Open");
	}
}
