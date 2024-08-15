package Assignment;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class default_sb {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		ChromeOptions op= new ChromeOptions();
		op.addArguments("headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(op);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
//		for (int i = 1; i <= rowCount; i++) {
//            String user = sheet.getRow(i).getCell(0).getStringCellValue();
//            String pass= sheet.getRow(i).getCell(1).getStringCellValue();
//            System.out.println(user+ "  "+pass);
//	}
//		file.close();
//		workbook.close();
 
	}

}
