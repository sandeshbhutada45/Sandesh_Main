package Main;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdfReader {
    public static void main(String[] args) throws InterruptedException, IOException {
    	 WebDriver driver;
       driver = new ChromeDriver();
        
        // Navigate to the URL containing the PDF link
        driver.get("https://example.com");

        // Find the PDF link and click it
        WebElement pdfLink = driver.findElement(By.linkText("Download PDF"));
        pdfLink.click();
        
     // Wait for the download to complete
        Thread.sleep(5000); // Adjust sleep duration as necessary
        
        // Assuming the downloaded PDF is in the default download directory
        String downloadDir = System.getProperty("user.home") + "/Downloads";
        File downloadFolder = new File(downloadDir);
        File[] files = downloadFolder.listFiles((dir, name) -> name.endsWith(".pdf"));
        
        // Load the downloaded PDF using PDFBox
        PDDocument document = PDDocument.load(new File("downloaded.pdf"));

        // Extract text from the PDF
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String pdfText = pdfStripper.getText(document);

        // Validate the content of the PDF
        if (pdfText.contains("Expected Text")) {
            System.out.println("PDF validation passed!");
        } else {
            System.out.println("PDF validation failed!");
        }
    }
}
