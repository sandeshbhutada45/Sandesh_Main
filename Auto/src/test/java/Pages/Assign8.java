package Pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign8 {
	public WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String propertiesFile = "/src/test/resources/config.properties";
	String writeExcelFile = "\\TestData\\ExcelHeaderWrite.xlsx";
	public static int rowCount;
	public static XSSFSheet sheet;
	public static XSSFSheet sheet1;
	public static XSSFWorkbook workbook;
	public static XSSFWorkbook workbook1;
//	public static XSSFRow headerRow;
//	public static List<String> myURL = new ArrayList<String>();
//	public static List<String> TITLE = new ArrayList<String>();
//	public static List<String> HEADERTEXT = new ArrayList<String>();
//	public static List<String> HEADERURL = new ArrayList<String>();
//	public static List<String> myResponse = new ArrayList<String>();

	public void accessingApplication() throws IOException

	// below is for opening browser and taking values from config.properties file
	{
		Properties properties = new Properties();
		FileInputStream configFile = new FileInputStream(projectPath + propertiesFile);
		properties.load(configFile);

		String url = properties.getProperty("URL10");
		if (url != null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		} else {
			System.out.println("URL NOT FOUND");
		}

		// below is for header, navigation and it's title
//		List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"header-nav\"]//a"));
//
//		{
//			for (int i = 0; i < links.size(); i++) {
//				String text = links.get(i).getText();
//				String link = links.get(i).getAttribute("href");
//				driver.get(link);
//				String title = driver.getTitle();
//				System.out.println("TITLE IS " + title);
//				System.out.println("HEADER TEXT: " + text);
//				System.out.println("HEADER LINK: " + link);
//				driver.navigate().back();
//				links = driver.findElements(By.xpath("//*[@id=\"header-nav\"]//a"));
//
//			}
//
//		}

		String[] headers = { "Title", "Header Text", "Header Link", "Code" };
		List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"header-nav\"]//a"));
		try {
			FileOutputStream fo = new FileOutputStream(projectPath + writeExcelFile);
			workbook1 = new XSSFWorkbook();
			sheet1 = workbook1.createSheet("Output");

			// Create the header row
			Row headerRow = sheet1.createRow(0);
			for (int col = 0; col < headers.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(headers[col]);
			}

			for (int i = 0; i < links.size(); i++) {
				String text = links.get(i).getText();
				String link = links.get(i).getAttribute("href");
				driver.get(link);
				String title = driver.getTitle();
				System.out.println("TITLE IS " + title);
				System.out.println("HEADER TEXT: " + text);
				System.out.println("HEADER LINK: " + link);

				// Create a new row for data
				Row dataRow = sheet1.createRow(i + 1);

				// Create cells and set values
				dataRow.createCell(0).setCellValue(title);
				dataRow.createCell(1).setCellValue(text);
				dataRow.createCell(2).setCellValue(link);

				driver.navigate().back();
				links = driver.findElements(By.xpath("//*[@id=\"header-nav\"]//a"));
			}

			workbook1.write(fo);
			workbook1.close();
			fo.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while writing to Excel: " + e.getMessage());
		}

		// below is for footer, navigation and it's title
		List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@class='footer']//a"));

		{
			for (int i = 0; i < footerlinks.size(); i++) {
				String text = footerlinks.get(i).getText();
				String link = footerlinks.get(i).getAttribute("href");
				driver.get(link);
				String title = driver.getTitle();
				System.out.println("TITLE IS " + title);
				System.out.println("FOOTER TEXT: " + text);
				System.out.println("FOOTER LINK: " + link);
				driver.navigate().back();
				footerlinks = driver.findElements(By.xpath("//div[@class='footer']//a"));

			}

		}

	}

}