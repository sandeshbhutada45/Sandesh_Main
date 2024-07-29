package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_6 {
	  //public WebDriver driver;

	    By username = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	    By password = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	    By btn = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

	  
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.findElement(username).sendKeys("Admin");
	        driver.findElement(password).sendKeys("admin123");
	        driver.findElement(btn).click();
	        return;
	    }

	   
	           
}
