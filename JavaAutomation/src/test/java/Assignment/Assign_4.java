package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_4 {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Sanket\\SSAUTOMATION\\Java\\src\\test\\resources\\config.properties");
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='level0 has-children']"));
		int categoryCount = elements.size();
		System.out.println(categoryCount);
		for(int i=0;i<=categoryCount;i++) {
			WebElement element= elements.get(i);
			element.click();
			String URL=driver.getCurrentUrl();
			System.out.println("URL: "+ URL);
			String title=driver.getTitle();
			System.out.println("Title is: "+title);
			elements = driver.findElements(By.xpath("//a[@class='level0 has-children']"));
		}
		
		System.out.println("TEST PASSED");
		driver.close();
	

}
}
