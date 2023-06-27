package PageObjectModelClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	LoginPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
		@FindBy(xpath = "//input[@id='username']")
		WebElement username;
		
		@FindBy (xpath = "//input[@id='password']")
		WebElement password;
		
		@FindBy (xpath = "//button[@type='submit']")
		WebElement submit;
		
		@FindBy (xpath = "//input[@name='keepSignedIn']")
		WebElement checkbox;
		
		public void Login (String un, String pw) {
			
			username.sendKeys(un);
			password.sendKeys(pw);
			checkbox.click();
			submit.click();
		}
		
}
