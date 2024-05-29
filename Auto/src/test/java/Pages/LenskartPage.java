package Pages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Reusable.Utils;

public class LenskartPage extends Utils {
	Utils ut = new Utils();
	By cancel = By.xpath("//*[@id='wzrk-cancel']");
	By Signin = By.xpath("(//*[contains(text(),'Sign In')])[1]");
	//By usern = By.xpath("//*[@class='modal-input-field ']");
	By usern = By.xpath("//*[@id=\"sign-in-form\"]/div/div[2]/div[2]/div[1]/input");
	
	//By signbtn = By.xpath("(//*[contains(text(),'Sign In')])[2]");
	By signbtn = By.xpath("/html/body/div[2]/div[2]/main/div[2]/div/div/div/div[2]/button");
	
	//By passw = By.xpath("//*[@title='password']");
	By passw = By.xpath("//*[@id=\"sign-in-form\"]/div/div[2]/div[3]/div[1]/input");
	
	//By search = By.xpath("//*[@name='q']");
	By search = By.xpath("//*[@id=\"header\"]/div[2]/div/div[2]/div/form/input");

	public void method1() throws IOException {
		openBrowser("Chrome");
		driver.get(ut.getPropertiesFiles("URL7"));
		driver.findElement(cancel).click();
		driver.findElement(Signin).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	public void method2() throws IOException {
		driver.findElement(usern).sendKeys(ut.getPropertiesFiles("user1"));
		driver.findElement(signbtn).click();
		driver.findElement(passw).sendKeys(ut.getPropertiesFiles("pass1"));
		driver.findElement(signbtn).click();
		System.out.println("Logged Succesfully");

	}

	public void method3() throws IOException {
		WebElement searchField = driver.findElement(search);
		searchField.sendKeys(ut.getPropertiesFiles("value"));
		searchField.sendKeys(Keys.ENTER);
		ut.getResponseCode();

	}

	public void method4() throws IOException {
		List<String> myList = new ArrayList<String>();
		List<String> mytitle = new ArrayList<String>();
		List<WebElement> allRow= driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[4]/div[1]/div/div/div"));
		int count= allRow.size();
		System.out.println(count);
		for(int ii=1;ii<=count;ii++) {
			for (int i = 1; i <= 3; i++) {
				List<WebElement> allglassesname = driver.findElements(
						By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[4]/div[1]/div/div/div[1]/div["
								+ i + "]/div/div/div/a/div[1]/div[1]"));
				List<WebElement> allglassesPrice = driver.findElements(
						By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[4]/div[1]/div/div/div[1]/div["
								+ i + "]/div/div/div/a/div[1]/div[3]"));
				for (int j = 0; j < allglassesname.size(); j++) {
					String Text = allglassesname.get(j).getText();
					String Price = allglassesPrice.get(j).getText();
					System.out.println("Sunglasses Text is: " + Text);
					System.out.println("Sunglasses Price is: " + Price);
					myList.add(Text);
					mytitle.add(Price);
					FileOutputStream fio = new FileOutputStream(
							"C:\\Users\\sanket.wadyalkar\\JavaAutomation\\Java\\TestData\\xyz.xlsx");
					XSSFWorkbook wb = new XSSFWorkbook();
					XSSFSheet sheet1 = wb.createSheet("Output");
					XSSFRow headerRow = sheet1.createRow(0);
					headerRow.createCell(0).setCellValue("Glasses Name");
					headerRow.createCell(1).setCellValue("Prices");
					for (int jj = 0; jj < myList.size(); jj++) {
						XSSFRow row = sheet1.createRow(jj + 1);
						row.createCell(0).setCellValue(myList.get(jj));
						row.createCell(1).setCellValue(mytitle.get(jj));
					}
					wb.write(fio);
					wb.close();
				}
				
			}
			driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[4]/div[1]/div/div/div"));
		}
		
	}

}
