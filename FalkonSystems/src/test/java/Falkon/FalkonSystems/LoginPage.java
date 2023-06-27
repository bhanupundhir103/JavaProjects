package Falkon.FalkonSystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage (WebDriver driver) {
		
		this.driver= driver;
		// PageFactory.initElements(driver, this);
	}
	
	By text_username = By.xpath("//input[@id='username']");
	By text_password = By.xpath("//input[@id='password']");
	By button_submit = By.xpath("//button[@type='submit']");
	
	// @FindBy(xpath="//input[@id='username']") WebElement username;
	// @FindBy (xpath="//input[@id='password']") WebElement password;
	// @FindBy (xpath = "//button[@type='submit']") WebElement submit;
	
	public void username (String username) {
		
		driver.findElement(text_username).sendKeys(username);
		// username.sendkeys(username);
	}
	
	public void password (String password) {
		
		driver.findElement(text_password).sendKeys(password);
		// password.sendkeys(password);
	}
	
	public void signin () {
		
		driver.findElement(button_submit).click();
		// submit.click();
	}

};
