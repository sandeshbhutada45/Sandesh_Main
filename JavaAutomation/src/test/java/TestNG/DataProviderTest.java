package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	WebDriver driver;

	@Test(dataProvider = "create")
	public void test1(String user, String pass) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
	}

	@DataProvider(name = "create")
	public Object[][] data() {

		return new Object[][] { { "locked_out_user", "secret_sauce" }, { "problem_user", "secret_sauce" },
				{ "visual_user", "secret_sauce" } };
	}

}
