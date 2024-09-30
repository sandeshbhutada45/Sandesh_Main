package Assignment;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class interview {

	public static void main(String args[]) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot ss= ((TakesScreenshot)driver);
		File src= ss.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\sandesh.bhutada\\OneDrive - Perficient, Inc\\Pictures\\blog\\xyz.png");
		FileUtils.copyFile(src,dest);
		
		System.out.println("Screenhsot is Taken Successfully");
	}
}
