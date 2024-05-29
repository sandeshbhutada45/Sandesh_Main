package Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class practice extends LoginPage {
	WebDriver driver;
	LoginPage lp = new LoginPage();

	public void loadprop() throws IOException {
		lp.step1();
		lp.getTitles("URL4");

	}

	public void screen() throws IOException {
		lp.takeScreenshot();
		lp.step2();
		lp.getPageURL();
//		lp.writeExcel("URL","Title","");
		lp.tearDown();
	}

	@Test
	public void result() throws IOException {
		loadprop();

	}

	@Test
	public void takess() throws IOException {
		screen();
		
	}
}
