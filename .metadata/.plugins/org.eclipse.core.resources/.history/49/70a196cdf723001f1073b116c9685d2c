package Main;

import java.time.Duration;

import org.openqa.selenium.By;

import Reusable.Utils;

public class implicitWait extends Utils {
    
	public static void main(String[] args) throws Exception {
        Utils uts = new Utils();

       
        uts.openBrowser("Chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(uts.getPropertiesFiles("URL10"));
        
        driver.findElement(By.xpath("//*[@class='level0 has-children']")).click();
        driver.close();
    }
}
