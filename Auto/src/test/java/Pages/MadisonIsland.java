package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Reusable.Utils;

public class MadisonIsland extends Utils{
	
	Utils ut1 = new Utils();

	public void method1() throws Exception
	{
		ut1.openBrowser("Chrome");
		driver.get(ut1.getPropertiesFiles("URL10"));
		System.out.println("Logged in to the Madison Island Application Successsfully");
		
		
		 List<WebElement> columns = driver.findElements(By.cssSelector("body > div > div.page > div.footer-container > div"));
		 
		 for (WebElement column : columns) 
		 { List<WebElement> ColText = column.findElements(By.tagName("a"));	   
		 
		 
	            for (WebElement footerLinkText : ColText)
	            {
	                String text = footerLinkText.getText();
	                String link = footerLinkText.getAttribute("href");
	                driver.get(link);
	                String title = driver.getTitle();
	                System.out.println("Title is " + title);
	                System.out.println("FOOTER TEXT: " + text);
	                System.out.println("FOOTER LINK: " + link);
	                driver.navigate().back();
	                columns = driver.findElements(By.cssSelector("body > div > div.page > div.footer-container > div"));
	                
	            }
	            
		 }
		 
	}
	
}
		

