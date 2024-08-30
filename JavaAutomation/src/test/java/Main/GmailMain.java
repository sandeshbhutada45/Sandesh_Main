package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GmailPage;

public class GmailMain {

	WebDriver driver;
	GmailPage gp;

	@BeforeTest
	public void steup() {
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--incognito");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		gp= new GmailPage(driver);
	}
	
	@Test
	public void test1() {
		gp.step1();
	}
	
	@Test
	public void test2() {
		gp.step2();
	}
}
