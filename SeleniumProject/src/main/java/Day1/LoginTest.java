package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();   // Browser Setup
		
		WebDriver driver = new ChromeDriver();   // Launch Browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");   // Open url on browser
		
		// Thread.sleep(1000);  // Wait time
		
		// Developer Tools ---> DOM --> Document Object Model
		
		// Every HTML element starts with a tag name, attribute and value
		
		WebElement username = driver.findElement(By.id("username"));  // Locator by ID
		username.clear();
		username.sendKeys("Sysadm.uat@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Uat@@123");
		
		WebElement Signin = driver.findElement(By.xpath("//button[@type='submit']"));  // Locator by xpath
		Signin.click();
		
		// Thread.sleep(8000);
	
//		String act_title = driver.getTitle();               // Title Verification
//		String exp_title = "Falkon SMS";
//		if (act_title.equals(exp_title))
//		{
//			System.out.println("Test is Passed");
//		}
//		else	
//		{
//			System.out.println("Test is Failed");
//		}
		
//		String act_label = driver.findElement(By.xpath("//span[text() ='Phone Numbers']")).getText(); // Text Verification
//		String exp_label = "Phone Numbers";
//		
//		if (act_label.equals(exp_label))
//			
//		{
//			System.out.println("Test is Passed");
//		}
//		
//		else
//			
//		{
//			System.out.println("Test is Failed");
//		}
		
		String act_label = null;
		
		try
		{
			act_label = driver.findElement(By.xpath("//span[text() ='Phone Numbers']")).getText();
		}
		
		catch (NoSuchElementException e)
		{
			act_label = "";
		}
		
		String exp_label = "Phone Numbers";
		
		if (act_label.equals(exp_label))
			
		{
			System.out.println("Login is Passed");
		}
		
		else
			
		{
			System.out.println("Login is Failed");
		}
		
		// driver.close();    // Close the browser
		
		driver.quit();
		
	}
}
