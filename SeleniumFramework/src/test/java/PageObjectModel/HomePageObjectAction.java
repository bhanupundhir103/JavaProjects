package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePageObjectAction {
	
	static WebDriver driver = null;
	static By username = By.id("username");
	static By password = By.id("password");
	static By button = By.xpath("//span[contains(text(), 'Sign In')]/parent::button");

	public static void username (String text) {
		
		driver.findElement(username).sendKeys(text);
		
	}
	
	public static void password (String text) {
		
		driver.findElement(password).sendKeys(text);
	}
	
	public static void button () {
		
		driver.findElement(button).sendKeys(Keys.RETURN);
	}

}
