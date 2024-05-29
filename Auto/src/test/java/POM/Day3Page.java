package POM;

import java.io.IOException;

import org.openqa.selenium.By;

public class Day3Page extends Day2pages {
	Day2pages d2 = new Day2pages();
	// public WebDriver driver;
	// Properties prop= new Properties();

	By username = By.id("user-name");
	By password = By.id("password");
	By btn = By.id("login-button");

	public void chormeopen() throws IOException {
		d2.properties();
	}

	public void navigate() throws IOException {
		driver.get(d2.prop.getProperty("URL4"));
	}

}
