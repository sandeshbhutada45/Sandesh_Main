package Assignment;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void step() {
		System.out.println("Method 3");
	}

	@Test
	public void step1() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		Dimension size = searchbox.getSize();
		System.out.println("Height is: " + size.height);
		System.out.println("Width is: " + size.width);

	}

	@Test
	public void step2() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Googlee");
	}
	
}
