package Assignment;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Addtocart {

static EdgeDriver driver;
	static int j = 0;

	public static void main(String[] args) {
	
	driver = new EdgeDriver();

		// When we are using Array List concept we dont have to use break
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Cauliflower" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.xpath("//*[contains(@class,'product-name')]"));

		//for (int i = 0; i <= products.size(); i++) 
		
		for (int i = 0; i < products.size(); i++)
		{
			// below line will give the actual product name as Cucumber -1 kg but in actual
			// we need cucumber
			// String name = products.get(i).getText();
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedname)) {
				// click on add to cart
				j++;
				driver.findElements(By.xpath("//*[contains(text(),'ADD TO CART')]")).get(i).click();
				if (j == 3)
					;
				{
					break;
				}
			}
		}

	}

}
