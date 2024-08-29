package Main;

import java.io.IOException;

import org.testng.annotations.Test;

import Reusable.Utils;
public class implicitWait extends Utils {
    
	@Test
	public void step1() throws IOException, Exception {
		openBrowser("Chrome");
		navigateUrl("https://www.saucedemo.com/");
		getBrokenURL();
	}
}
