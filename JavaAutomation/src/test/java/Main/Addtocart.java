package Main;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Addtocart {

	static EdgeDriver driver;
	static int j = 0;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.manage().window().maximize();

		// When we are using Array List concept we don't have to use break
		String[] itemsNeeded = {"Cauliflower", "Potato", "Cucumber", "Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(3000);
		
		//List<WebElement> products = driver.findElements(By.xpath("//*[contains(@class,'product-name')]"));
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		// for (int i = 0; i <= products.size(); i++)

		for (int i = 0; i <= products.size(); i++) {
			// below line will give the actual product name as Cucumber -1 kg but in actual
			// we need cucumber
			// String name = products.get(i).getText();
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedname)) {
				// click on add to cart
				j++;
				//driver.findElements(By.xpath("//*[contains(text(),'ADD TO CART')]")).get(i).click();
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}

	}

}
