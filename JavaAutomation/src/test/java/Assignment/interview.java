package Assignment;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class interview {

	public static void main(String args[]) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[starts-with(@class, 'common')]")).click();
		
		List<WebElement> list= driver.findElements(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			String text= list.get(i).getText();
			System.out.println(text);
		}
		
	}
}
