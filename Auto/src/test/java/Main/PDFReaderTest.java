package Main;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PDFReaderTest {

	WebDriver driver;
	String pdf = "https://pdfobject.com/pdf/sample.pdf";

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get(pdf);
	}

	@Test
	public void PDFRead() throws IOException {
		URL pdfUrl = new URL(pdf);
		InputStream ip = pdfUrl.openStream();
		BufferedInputStream bfInput= new BufferedInputStream(ip);
		PDDocument pdDoc= PDDocument.load(bfInput);
		int count= pdDoc.getNumberOfPages();
		System.out.println("NUmber Of Pages: "+count);

	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}
