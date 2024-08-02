package TestNG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DependsTest {
	WebDriver driver;

	@Test
	public void test1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test(dependsOnMethods = "test1")
	public void test2() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@Test(dependsOnMethods = "test2") //Failing
	public void test3() {
		String title = driver.getTitle();
		assertEquals(title, "Swag Lab4s","Title Is Not Matched");
	}


}
