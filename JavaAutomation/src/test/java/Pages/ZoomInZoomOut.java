package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomInZoomOut {

	WebDriver driver;

	@Test
	public void f() throws InterruptedException {

		ChromeOptions options= new ChromeOptions();
        
        options.addArguments("window-size=1920x1080"); 
        options.addArguments("--force-device-scale-factor=0.67");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
		
//        try {
//            driver.findElement(By.linkText("About")).click();
//        } catch (NoSuchElementException e) {
//            System.out.println("Element 'About' not found.");
//        }
//		
//		Thread.sleep(2000);
//		
////		Dimension dm = new Dimension(1450, 563);
////		driver.manage().window().setSize(dm);
//
//		//method2
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("document.body.style.zoom='20%'");
//		
//
//		Thread.sleep(1000);
		//driver.close();
	}
}
