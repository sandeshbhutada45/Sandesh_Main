package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void step1() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("headless");
		ChromeDriver driver = new ChromeDriver(op);
		driver.navigate().to("https://www.google.com");
		System.out.println("Title is: "+driver.getTitle());
	}

	@Test
	public void step2() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		Dimension size = searchbox.getSize();
		System.out.println("Height is: " + size.height);
		System.out.println("Width is: " + size.width);

	}

}
