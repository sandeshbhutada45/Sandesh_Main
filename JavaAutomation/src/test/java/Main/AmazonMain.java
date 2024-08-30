package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AmazonPage;

public class AmazonMain {

	WebDriver driver;
	AmazonPage ap;

	@BeforeTest
	public void steup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		ap = new AmazonPage(driver);
	}

	@Test
	public void main1() {
		driver.get("https://www.amazon.in/");
		ap.step1();

	}

	@Test
	public void main2() {
		ap.step2();
	}

	@Test

	public void main3() {
		ap.step3();
	}

	@AfterTest

	public void teardown() {
		driver.quit();
	}
}
