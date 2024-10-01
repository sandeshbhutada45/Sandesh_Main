package Assignment;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class interview {

	public static void main(String args[]) throws Exception {

		for(int i=1;i<=30;i++) {
			if(i/2==0) {
				System.out.println(i+" is Prime Number");
			}
			else {
				System.out.println(i+" is Not Prime Number");
			}
		}
	}
}
