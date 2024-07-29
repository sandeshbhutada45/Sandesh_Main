package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Reusable.Utils;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1pages extends Utils {
	public WebDriver driver;
	Utils u = new Utils();

	By username = By.id("username");
	By password = By.id("password");
	By btn = By.id("submit");

	public void browse() throws IOException {
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Sanket\\SSAUTOMATION\\Java\\src\\test\\resources\\config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("URL2"));
	}

	public void pgurl() {
		u.getPageURL();
	}

	public void screenshot() throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("dd_MM_yyyy__hh_mm_ss").format(new Date());
		File DestFile = new File("C:\\Sanket\\SSAUTOMATION\\Java\\test-output\\Screenshots\\sanket.jpeg" + timestamp);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

	public void steps() {
		driver.findElement(username).sendKeys("student");
		driver.findElement(password).sendKeys("Password123");
		driver.findElement(btn).click();

	}
}
