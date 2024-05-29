package Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Reusable.Utils;

public class windowhandel extends Utils {
	Utils ut = new Utils();

	public void main() {
		ut.openBrowser("Chrome");
	}

	public void main2() {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='getwebsitebtn']")).click();
	}

	public void main3() {

		ut.getChildWindowHandle();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/a[4]")).click();
		System.out.println(driver.getTitle());
	}
	public void main4() {
		ut.getParentWindowHandle();
		driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
	}

	@Test
	public void result() {
		main();
		main2();
		main3();
		main4();
		}
}
