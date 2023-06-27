package SignUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNG {
	
	WebDriver driver = null;

	@BeforeTest
	public void BeforeTest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@Test
	
	public void Test1() {
		
	driver.findElement(By.xpath("//a[text() = 'Sign Up']")).click();
	
	String actualtext_nav_signup = driver.findElement(By.xpath("//span[text() = 'Sign Up']")).getText();
	
	String expectedtext_nav_signup = "Sign Up";
	
	if (actualtext_nav_signup.equals(expectedtext_nav_signup))
		
	{
		System.out.println("Navigation to Sign Up Page through Text is Validated Successfully");
	}
	
	else
	{
		System.out.println("Navigation to Sign Up Page Validation through text is Failed");
	}	
		
	}
	
	@Test
	
	public void Test2() {
		
    	driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actualwebsiteurl = driver.getCurrentUrl();
    	
    	String expectedwebsiteurl = "https://www.falkonsms.com/";
    	
    	if (actualwebsiteurl.equals(expectedwebsiteurl))
    		
    	{
    		System.out.println("Website Url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Website Url Validation Failed");
    	}
    	
    	driver.switchTo().window(childwindowlist).close();
    	
    	driver.switchTo().window(parentwindowlist);
    	
    }
	
	@AfterTest
	
	public void AfterTest() {
		
    System.out.println("Test Script Executed Successfully");
		
    driver.quit();
	
	}
	
}
