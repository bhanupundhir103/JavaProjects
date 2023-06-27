import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	public static void main (String []args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		
		driver.findElement(By.id("username")).sendKeys("Sysadm.uat@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Uat@@123");
		
		driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]/parent::button")).click();
		
	}

}