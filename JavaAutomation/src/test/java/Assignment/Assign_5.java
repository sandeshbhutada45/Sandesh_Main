package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_5 {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Sanket\\SSAUTOMATION\\Java\\src\\test\\resources\\config.properties");
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		
		List<WebElement> links= driver.findElements(By.xpath("//div[@class='footer']//a"));
		
		
		for(int i=0;i<links.size();i++) {
			String href=links.get(i).getAttribute("href");
			System.out.println("URL:"+href);
			links.get(i).click();
			String title=driver.getTitle();	
			System.out.println("Title is:"+title);
			driver.navigate().back();
			links= driver.findElements(By.xpath("//div[@class='footer']//a"));
		}
		driver.close();   
	}
}
