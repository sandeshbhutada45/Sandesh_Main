package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import Reusable.Utils;

public class readCredentialPage extends Utils {

	Utils ut = new Utils();
	By username = By.id("user-name");
	By password = By.id("password");
	By btn = By.id("login-button");

	public void Excel() throws IOException {

		ut.readExcel();
		for (int i = 1; i <= rowCount; i++)
		{
			ut.openBrowser("Chrome");
			driver.navigate().to(ut.getPropertiesFiles("URL4"));
			String user = sheet.getRow(i).getCell(0).getStringCellValue();
			String pass = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(user);
			System.out.println(pass);
			driver.findElement(username).sendKeys(user);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(btn).click();
			driver.close();
			
		}		
		
	}
}
