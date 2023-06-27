import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().driverVersion("112.0.1722.68").setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		
		driver.findElement(By.id("username")).sendKeys("Sysadm.uat@gmail.com");
		
		// driver.findElement(By.id("password")).sendKeys("Uat@@123");
		
		WebElement passwordtextbox = driver.findElement(By.id("password"));
		
		passwordtextbox.sendKeys("Uat@@123");
		
		driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]/parent::button")).click();
		
		List<WebElement> inputfields = driver.findElements(By.xpath("//input"));
		
		int count = inputfields.size();
		
		System.out.println("List of elements: "+ count);
		
		System.out.println("Test Completed Successfully");
		
	}

}
