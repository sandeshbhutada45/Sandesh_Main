package Reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	String projectPath = System.getProperty("user.dir");
	String propertiesFile = "\\src\\test\\resources\\config.properties";
	String Screenshot = "\\test-output\\Screenshots\\screenshot.jpge";
	String writeExcelFile = "\\TestData\\ExcelURLWrite.xlsx";
	String readExcelFile = "\\TestData\\ExcelURLRead.xlsx";

	public static WebDriver driver;
	public static Properties LP;
	public static int rowCount, code;
	public static XSSFSheet sheet, sheet1;
	public static XSSFWorkbook workbook, workbook1;
	public static XSSFRow headerRow;
	public static String user, pass, href, title, childWindow, parentWindow, text, attributeValue;
	public static List<String> myURL = new ArrayList<String>();
	public static List<String> myTitle = new ArrayList<String>();
	public static List<String> myResponse = new ArrayList<String>();
	public static List<WebElement> allLinks;
	public static int LinksCount;
	public Iterator<String> IT;
	public Set<String> windowHandle;

/////////// OPEN CHROME BROWSER/////////////////
	public void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		case "Firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		case "Edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		default:
			System.out.println("Invalid Browser Name: " + browserName);
			return;
		}
	}

/////////// LOAD PROPERTIES FILE AND FETCH CREDENTIAL FROM PROPERTIES FILE//////////////
	public String getPropertiesFiles(String key) throws IOException {
		try {
			LP = new Properties();
			FileInputStream FIS = new FileInputStream(projectPath + propertiesFile);
			LP.load(FIS);
		} catch (Exception e) {
			System.out.println("Something went wrong in getPropertiesFiles Method");
		}
		return LP.getProperty(key);
	}

/////////// OPEN URL/////////////////
	public void navigateUrl(String url) {
		try {
			driver.navigate().to(url);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		} catch (Exception exception) {
			System.out.println("Error in NavigateURL Method");
		}

	}

//////////// NAVIGATE BACK///////////////
	public void navigateback() {
		try {
			driver.navigate().back();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		} catch (Exception exception) {
			System.out.println("Error in NavigateBack Method");
		}
	}

/////////// Sleep/////////////////
	public void sleep(long second) throws InterruptedException {
		Thread.sleep(second);
	}

/////////////IMPLICIT WAIT////////////////////////
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

/////////////////WAIT UNIIL ELEMENT CLICKABLE///////////////////
	public void waitAndClick(WebElement element, int numberOfSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(numberOfSeconds));
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception exception) {
			System.out.println("Error in waitAndClick Method");
		}
	}

///////////////WAIT UNITL ELEMENT VISIBLE//////////////////
	public void waitUntilElementVisible(WebElement element, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception exception) {
			System.out.println("Error in waitUntilElementVisible Method");
		}
	}

/////////// Click On WebElement/////////////////
	public void click(WebElement element) {
		try {
			element.click();
		} catch (Exception exception) {
			System.out.println("Unable to Click");
		}
	}

////////////////////DOUBLE CLICK////////////////////////////////
	public void doubleClickByAction(WebElement element, String message) {
		try {
			Actions actions = new Actions(driver);
			actions.doubleClick(element).build().perform();
		} catch (Exception exception) {
			System.out.println("Error in DoubleCLick Method");
		}
	}

/////////// Send Keys /////////////////
	public void sendKeys(WebElement element, String keys) {
		try {
			element.clear();
			element.sendKeys(keys);

		} catch (Exception exception) {
			System.out.println("Unable to Send Keys");
		}
	}

///////////GET TITLE///////////////
	public String getTitles(String URL) {
		try {
			title = driver.getTitle();
			System.out.println("Title For Page: " + title);
		} catch (Exception e) {
			System.out.println("Something Went Wrong in getTitles Method");
		}
		return title;
	}

////////////GET TEXT////////////////
	public void getText(WebElement element) {
		try {
			text = element.getText();
		} catch (Exception e) {
			System.out.println("Unable to get Text");
		}
	}

//////////GET ATTRIBUTE VALUE/////////
	public String getAttributeValue(WebElement element) {
		try {
			attributeValue = element.getAttribute("Value");
		} catch (Exception exception) {
			System.out.println("Unable to Get Attribute Value");
		}
		return attributeValue;
	}
///////////ALERTS///////////////////////

	public void acceptAlert(WebElement element) {
		try {
			waitAndClick(element, 100);
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception exception) {
			System.out.println("Unable to Accept Alert");
		}
	}

	public void dismissAlert(WebElement element) {
		try {
			waitAndClick(element, 100);
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception exception) {
			System.out.println("Unable to Accept Alert");
		}
	}

///////////GETPAGEURL///////////////
	public void getPageURL() {
		try {
			allLinks = driver.findElements(By.tagName("a"));
			LinksCount = allLinks.size();
			System.out.println("URLs COUNT: " + LinksCount);
			for (WebElement links : allLinks) {
				allLinks = driver.findElements(By.tagName("a"));
				href = links.getAttribute("href");
				System.out.println("URL: " + href);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong in getPageURL Method");
		}
	}

//////////////HOVER//////////////////////	
	public void hoverElement(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).build().perform();
			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Error in hoverElement Method");
		}

	}

	public void hoverToClick(WebElement element, WebElement element1) throws InterruptedException {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.moveToElement(element1).click().build().perform();
			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Error in hover&Click Method");

		}

	}

////////////////////READ FROM EXCEL///////////////////////
	public void readExcel() throws IOException {
		try {
			FileInputStream file = new FileInputStream(projectPath + readExcelFile);
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);
			rowCount = sheet.getLastRowNum();
			System.out.println("Rows count: " + rowCount);
		} catch (Exception e) {
			System.out.println("Something went wrong in readExcel Method");
		}
	}

////////////DRAG and DROP////////////////////////////
	public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
		try {
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceElement, destinationElement).build().perform();
		} catch (StaleElementReferenceException exception) {

		} catch (Exception exception) {
			System.out.println("Error in Drag&Drop Method");
		}
	}

///////////WRITE URLs+TITLE IN EXCEL FOR MULTIPLE PAGES OF APPLICATION///////////////

	public void writeExcel(String cell1, String cell2, String cell3) throws IOException {
		try {
			FileOutputStream fo = new FileOutputStream(projectPath + writeExcelFile);
			workbook1 = new XSSFWorkbook();
			sheet1 = workbook1.createSheet("Output");
			headerRow = sheet1.createRow(0);
			headerRow.createCell(0).setCellValue(cell1);
			headerRow.createCell(1).setCellValue(cell2);
			headerRow.createCell(2).setCellValue(cell3);
			for (int j = 0; j < myURL.size(); j++) {
				XSSFRow row = sheet1.createRow(j + 1);
				row.createCell(0).setCellValue(myURL.get(j));
				row.createCell(1).setCellValue(myTitle.get(j));
				row.createCell(2).setCellValue(myResponse.get(j));
			}
			workbook1.write(fo);
			workbook1.close();
			fo.close();
		} catch (IOException e) {
			System.out.println("Something went wrong in writeExcel Method");
		}
	}

/////////////GETCHILDWINDOW//////////////////
	public void getChildWindowHandle() {
		try {
			windowHandle = driver.getWindowHandles();
			IT = windowHandle.iterator();
			parentWindow = IT.next();
			childWindow = IT.next();
			driver.switchTo().window(childWindow);
			System.out.println("We are on Child Window");
		} catch (Exception e) {
			System.out.println("Something went wrong in getChildWindowHandle Method");
		}
	}

/////////////GETPARENTWINDOW//////////////////
	public void getParentWindowHandle() {
		try {
			windowHandle = driver.getWindowHandles();
			IT = windowHandle.iterator();
			parentWindow = IT.next();
			childWindow = IT.next();
			driver.switchTo().window(parentWindow);
			System.out.println("We are on Parent Window");
		} catch (Exception e) {
			System.out.println("Something went wrong in getParentWindowHandle Method");
		}
	}

/////////////////GETRESPONSECODE OF URL's///////////////////////
//	200 - It means success, the link is working.
//	404 - It's the most common one, which means Page not found.
//	403 - Authorization is required to access the page. 
//	400 - It has different meanings, bad request, bad host, timeout, etc.
//	500 - Internal server error.
	public int getResponseCode() throws IOException {
		HttpURLConnection cn = (HttpURLConnection) new URL(driver.getCurrentUrl()).openConnection();
		code = cn.getResponseCode();
		System.out.println("Responce Code: " + code);
		return code;
	}

//////////// BROKEN URL////////////////////////
	public void getBrokenURL() throws Exception, IOException {
		try {
			getResponseCode();
			if (code >= 400) {
				System.out.println("URL is Broken: " + driver.getCurrentUrl());
			} else {
				System.out.println("URL is Working Fine: " + driver.getCurrentUrl());
			}
		} catch (IOException e) {
			System.out.println("IOException occurred: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}
	}

///////////////GETIMAGE AND TEXT FROM PAGES///////////////////
	public void getImageAndText() throws IOException {
		try {
			List<WebElement> allImg = driver.findElements(By.tagName("img"));
			int imgCount = allImg.size();
			System.out.println("Counts for images on pages: " + imgCount);
			for (WebElement img : allImg) {
				String image = img.getAttribute("src");
				String text = img.getAttribute("alt");
				code = getResponseCode();
				System.out.println("SRC: " + image);
				System.out.println("Image Text: " + text);
				System.out.println("Responce Code is: " + code);
				myURL.add(image);
				myResponse.add(String.valueOf(code));
				myTitle.add(text);
			}
		} catch (IOException e) {
			System.out.println("Something went wrong in getImageAndText Method");
		}
	}

///////////TAKE SCREENSHOTS///////////////
	public void getScreenshot() throws IOException {

		try {
			TakesScreenshot ss = ((TakesScreenshot) driver);
			File src = ss.getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("dd_MM_yyyy__hh_mm_ss").format(new Date());
			File destFile = new File(projectPath + Screenshot + timestamp);
			FileUtils.copyFile(src, destFile);
		} catch (IOException e) {
			System.out.println("Something went wrong in takeScreenshot Method");
		}
	}

/////////////GET DROPDOWN VALUES///////////////////////////
	public void getDropdownByIndex(By locator, int index) {
		try {
			WebElement dropdownElement = driver.findElement(locator);
			Select dropdown = new Select(dropdownElement);
			dropdown.selectByIndex(index);
		} catch (Exception e) {
			System.out.println("Error in getDropdownByIndex ");
		}
	}

	public void getDropdownByText(By locator, String text) {
		try {
			WebElement dropdownElement = driver.findElement(locator);
			Select dropdown = new Select(dropdownElement);
			dropdown.selectByVisibleText(text);
		} catch (Exception e) {
			System.out.println("Error in getDropdownByText ");
		}
	}

	public void getDropdownByValue(By locator, String value) {
		try {
			WebElement dropdownElement = driver.findElement(locator);
			Select dropdown = new Select(dropdownElement);
			dropdown.selectByValue(value);
		} catch (Exception e) {
			System.out.println("Error in getDropdownByIndex ");
		}
	}

////////////////SCROLL TO ELEMENT/////////////////////////
	public void scrollWebPageToElement(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
		} catch (Exception exception) {
			System.out.println("Error in ScrolltoElement Method");

		}
	}

////////////GET DATE & TIME ///////////////////
	public void getDateTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
	}

	/////////////// CLOSE BROWSER//////////////////
	public void tearDown() {
		driver.close();
	}

}
