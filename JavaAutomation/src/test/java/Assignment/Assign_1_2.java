package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_1_2 {

	public static void main(String[] args) throws IOException {
		

		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Sanket\\SSAUTOMATION\\Java\\src\\test\\resources\\config.properties");
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		
		WebElement acc= driver.findElement(By.xpath("(//a[@class='level0 has-children'])[3]"));
		Actions hover= new Actions(driver);
		hover.moveToElement(acc).perform();
	

		
		
		driver.findElement(By.xpath("(//*[contains(text(),'Eyewear')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Add to Cart')])[1]")).click();
		System.out.println("Test passed");
		driver.close();
		
		
	}

}
