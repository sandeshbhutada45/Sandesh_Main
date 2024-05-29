package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testSwagLabs {

	Login login;
	homePage HomePage;
	WebDriver driver;

	@BeforeTest
	public void setup() {
//		WebDriverManager.firefoxdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@Test

	public void testhomepage() {
		login = new Login(driver);
		login.loginToSwagLabs("standard_user", "secret_sauce");

		HomePage = new homePage(driver);
		String logo = HomePage.getTextFromLogo();
		System.out.println(logo);

	}
}
