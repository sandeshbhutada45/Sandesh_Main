package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Pages.MakeMyTripPage;;

public class MakeMyTripMain {

	WebDriver driver;

	@BeforeTest
	public void steup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void mmt() {
		driver.get("https://www.makemytrip.com/");
		MakeMyTripPage mmtp = new MakeMyTripPage(driver);
		mmtp.step1();
		mmtp.step2();
		mmtp.step3();
		mmtp.step4();
		mmtp.step5();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
