package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationInterview {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[starts-with(@class, 'common')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@placeholder,'From')]"))).sendKeys("Nagpur");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Nagpur']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("toCity"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@placeholder,'To')]"))).sendKeys("Hyderabad");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Hyderabad']"))).click();
		
		driver.findElement(By.linkText("26")).click();
		System.out.println(driver.getTitle());


	}

}
