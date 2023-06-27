package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	static WebElement username = null;
	static WebElement password = null;
	static WebElement button = null;
	
	public static WebElement username (WebDriver driver) {
		
		username = driver.findElement(By.id("username"));
		return username;
				
	}
	
	public static WebElement password (WebDriver driver) {
		
		password = driver.findElement(By.id("password"));
		return password;
	}
	
	public static WebElement button (WebDriver driver) {
		
		button = driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]/parent::button"));
		return button;
	}

	public static void button() {
		
	}

}