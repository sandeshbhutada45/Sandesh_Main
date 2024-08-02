package TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test(priority = 3, groups = "Title")
	public void test1() {
		System.out.println("Title is: " + driver.getTitle());
	}

	@Test(priority = 2, groups = "Logo",enabled = false)
	public void test2() {
		Boolean b = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).isDisplayed();
	}

	@Test(priority = 1, groups = "Crendtial")
	public void test3() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
