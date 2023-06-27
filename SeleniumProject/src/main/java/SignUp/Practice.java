package SignUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		
		driver.manage().window().maximize();
		
		String actualtextloginpage = driver.findElement(By.xpath("//span[contains(text(), 'Manage your workflow!')]")).getText();
		
		String expectedtextloginpage  = "Manage your workflow!";
		
		if(actualtextloginpage.equals(expectedtextloginpage))
			
		{
			System.out.println("Login page text is validated Successfully");
		}
		
		else
			
		{
			System.out.println("Login page text validation is failed");
		}
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sysadm.uat@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Uat@@123");
		
		Boolean checkbox = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		
		if (checkbox == false)
			
		{
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		}
		
		// driver.findElement(By.xpath("//input[@value='false']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]//parent::button/span")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		String actuallogintext = driver.findElement(By.xpath("//span[contains(text(), 'Add Phone Number')]")).getText();
		
		String expectedlogintext = "Add Phone Number";
		
		if (actuallogintext.equals(expectedlogintext))
			
		{
			System.out.println("User is Logged In Text is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("User is Logged In Text Validation is Failed");
		}
		
		driver.findElement(By.xpath("//div[contains(text(), 'Organizations')]")).click();
		
		String actualorganizationsurl = driver.getCurrentUrl();
		
		String expectedorganizationurl = "https://uat-falkonsms-fe.azurewebsites.net/organizations";
		
		if (actualorganizationsurl.equals(expectedorganizationurl))
			
		{
			System.out.println("Organizations url is validated successfully");
		}
		
		else
			
		{
			System.out.println("Organizations url validation is failed");
		}
		
		String text = driver.findElement(By.xpath("//span[@class='ag-paging-description']")).getText(); // Page 1 of 18
		
		// int pages = Integer.parseInt(text.substring(text.indexOf("of")+2,text.indexOf("of")+4));
		
		System.out.println(text);
		
		System.out.println("Test Scripts Executed Successfully");
		
		// driver.quit();
	}

}
