package Pages;

import java.io.IOException;

import Reusable.Utils;

public class ActmeraPage extends Utils {
	String urlName= "URL5";

	public void step1() throws IOException {
		openBrowser("Chrome");
		System.out.println(getPropertiesFiles(urlName));
		driver.navigate().to(getPropertiesFiles(urlName));
	}

	public void step2() throws IOException {
		takeScreenshot();
	
	}
//
	public void step3() throws IOException {
		writeExcel("Links","Title","Response Code");
		tearDown();
	}

}
