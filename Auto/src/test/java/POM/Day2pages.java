package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2pages {

	public static WebDriver driver;
	public String mg;
	Properties prop = new Properties();
	String file= "C:\\Sanket\\SSAUTOMATION\\Java\\src\\test\\resources\\config.properties";
	By acc = By.xpath("(//*[contains(text(),'Account')])[1]");
	By register = By.xpath("//*[contains(text(),'Register')]");
	By fname = By.xpath("//*[@id='firstname']");
	By lname = By.xpath("//*[@id='lastname']");
	By email = By.xpath("//*[@id='email_address']");
	By pass = By.xpath("//*[@id='password']");
	By cpass = By.xpath("//*[@id='confirmation']");
	By btn = By.xpath("//*[@id=\"form-validate\"]/div[2]/button");
	By msg = By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div/div/ul/li/ul/li/span");

	public void brow() {
		driver.get(prop.getProperty("URL3"));
	}

	public void formpage() {
		driver.findElement(fname).sendKeys("Sandesh");
		driver.findElement(lname).sendKeys("Bhutada");
		driver.findElement(email).sendKeys("sandeshsb111@gmail.com");
		driver.findElement(pass).sendKeys("Sandesh@45");
		driver.findElement(cpass).sendKeys("Sandesh@45");
		driver.findElement(btn).click();
		mg = driver.findElement(msg).getText();
		System.out.println(mg);
	}

	public void properties() throws IOException {
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		System.out.println("PASSED");
	
	}

	public void registerpage() {
		driver.findElement(acc).click();
		driver.findElement(register).click();
	}

	public void teardown() {
		driver.close();

	}

}
