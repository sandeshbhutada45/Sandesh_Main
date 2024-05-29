package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By username = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");

	public Login(WebDriver driver) {
		this.driver = driver;

	}

	public void setUserName(String setUserName) {

		driver.findElement(username).sendKeys(setUserName);
	}

	public void setPassword(String setPassword) {

		driver.findElement(password).sendKeys(setPassword);
	}

	public void onClick() {

		driver.findElement(login).click();
	}

	public void loginToSwagLabs(String username, String password) {
		this.setUserName(username);
		this.setPassword(password);
		this.onClick();
	}

}
