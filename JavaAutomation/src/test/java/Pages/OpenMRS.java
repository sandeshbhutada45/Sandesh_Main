package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Reusable.Utils;

public class OpenMRS extends Utils {
	Utils ut = new Utils();
	By Us = By.xpath("//*[@id=\"username\"]");
	By Pa = By.xpath("//*[@id=\"password\"]");
	By Location = By.xpath("//*[@id=\"Inpatient Ward\"]");
	By Login = By.xpath("//*[@id=\"loginButton\"]");
	By Asc = By.xpath("//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]");
	By Mst = By.xpath("//*[@id=\"appointmentschedulingui-manageAppointmentTypes-app\"]");
	By Name = By.xpath("//*[@id=\"appointmentTypesTable\"]/tbody/tr/td[1]");
	By PageNo = By.xpath("//*[@class='fg-button ui-button ui-state-default'][1]");
	By Duration = By.xpath("//*[@id=\"appointmentTypesTable\"]/tbody/tr/td[2]");

	public void method1() throws Exception {
		ut.openBrowser("Chrome");
		driver.get(ut.getPropertiesFiles("URL9"));
		driver.findElement(Us).sendKeys(ut.getPropertiesFiles("UserN"));
		driver.findElement(Pa).sendKeys(ut.getPropertiesFiles("PassW"));
		driver.findElement(Location).click();
		driver.findElement(Login).click();
		System.out.println("Logged in the OpenMRS application successfully");
		driver.findElement(Asc).click();
		driver.findElement(Mst).click();
		List<WebElement> NameList = driver.findElements(Name);
		for (int i = 1; i < NameList.size(); i++) {
			String Text = NameList.get(i).getText();
			System.out.println("Text avaialble are" + Text);
		}
	}

	public void ToGetCoulmnData() {

		List<WebElement> NameList = driver.findElements(Name);
		for (int i = 1; i < NameList.size(); i++) {
			String Text = NameList.get(i).getText();
			System.out.println("Text avaialble are" + Text);
		}
	}

	public void ToGetCoulmnDataNextPage()

	{
		driver.findElement(PageNo).click();
		System.out.println("User is on Page 2");

		List<WebElement> NameList = driver.findElements(Name);
		List<WebElement> NameList2 = driver.findElements(Duration);
		int minSize = Math.min(NameList.size(), NameList2.size());

		for (int i = 0; i < minSize; i++)

		{
			String text1 = NameList.get(i).getText();
			String text2 = NameList2.get(i).getText();

			System.out.println("Text available under column 1: " + text1);
			System.out.println("Text available under column 2: " + text2);
		}

	}
}
