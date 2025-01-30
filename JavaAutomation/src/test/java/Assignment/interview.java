package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class interview {

@Test
public void test() {
	 
	WebDriver driver1= new ChromeDriver();
	WebDriver driver2= new FirefoxDriver();
	
	driver1.get("https://www.amazon.com");
	driver1.manage().window().maximize();
	driver2.get("https://www.amazon.com");
	driver2.manage().window().maximize();
	
}
	
}
