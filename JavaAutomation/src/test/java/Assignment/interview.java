package Assignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class interview {

	@Test
	public void test() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.basspro.com");
		 driver.manage().window().maximize();
		 String title=driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.xpath("(//*[contains(text(),'Off Road Sales')])[1]")).click();
		 

	}
}
