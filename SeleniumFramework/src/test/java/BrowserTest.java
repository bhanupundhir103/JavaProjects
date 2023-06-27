// import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModel.HomePage;
// import PageObjectModel.HomePage;
import PageObjectModel.HomePageObjectAction;

//import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class BrowserTest {
	
	public static void main (String []args) {
		
		WebDriver driver = new FirefoxDriver();
		
		// WebDriver driver1 = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// HomePageObjectAction Action = new HomePageObjectAction(driver);
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		
		driver.findElement(By.id("username")).sendKeys("Sysadm.uat@gmail.com");
		// HomePage.username(driver).sendKeys("Sysadm.uat@gmail.com");
		// HomePageObjectAction.username("Sysadm.uat@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Uat@@123");
		// HomePage.password(driver).sendKeys("Uat@@123");
		// HomePageObjectAction.password("Uat@@123");
		
		// driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]/parent::button")).click();
		// HomePage.button(driver).click();
		HomePageObjectAction.button();
		
		/* System.out.println("Title of the Page:" + driver1.getTitle());
		
		System.out.println("Current Url of the Page:" + driver1.getCurrentUrl()); */
		
		// driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}

}