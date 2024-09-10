package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationInterview {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://caterpillar.e2open.com/CLOCKSPEEDPP_sc/e2sc/home.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"accept-button\"]")).click();
		Select selct = new Select(driver.findElement(By.xpath("//*[@id=\"dropdownlist\"]")));
		selct.selectByValue("idp1.chg.e2open.com");
		driver.findElement(By.xpath("/html/body/div/div/div/section/form/nav/div/input")).click();
		driver.findElement(By.id("username")).sendKeys("manasa.mellacheruvu@cat.com");
		driver.findElement(By.id("password")).sendKeys("Prismconnect_123");
		driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/header/div[2]/nav/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@title=\"Demand Collaboration\"]")).click();
//		driver.findElement(By.xpath("(//a[contains(text(),'Demand Review Collaboration')])[2]")).click();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.body.style.zoom='0.67'");


//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[starts-with(@class, 'common')]"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@placeholder,'From')]"))).sendKeys("Nagpur");
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Nagpur']"))).click();
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("toCity"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@placeholder,'To')]"))).sendKeys("Hyderabad");
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Hyderabad']"))).click();
//		
//		driver.findElement(By.linkText("26")).click();
//		System.out.println(driver.getTitle());

	}

}
