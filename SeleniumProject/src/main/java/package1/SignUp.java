package package1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {
	
	WebDriver driver = null;

	@BeforeMethod
	public void BeforeMethod() {
		
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(false);
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(options);
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text() = 'Sign Up']")).click();

	}
	
	@Test
	
	public void Test1() throws IOException {
		
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\SignUp\\signuppage.png");
    	
    	FileUtils.copyFile(src, trg);
		
		String actualtext_nav_signup = driver.findElement(By.xpath("//span[text() = 'Sign Up']")).getText();
		
		String expectedtext_nav_signup = "Sign Up ";
		
		/* if (actualtext_nav_signup.equals(expectedtext_nav_signup))
			
		{
			System.out.println("Navigation to Sign Up Page through Text is Validated Successfully");
		}
		
		else
		{
			System.out.println("Navigation to Sign Up Page Validation through text is Failed");
		} */
		
		Assert.assertEquals(actualtext_nav_signup, expectedtext_nav_signup, "Sign Up text is not equal");
		
		String actualurl_nav_signup = driver.getCurrentUrl();
		
		String expectedurl_nav_signup = "https://uat-falkonsms-fe.azurewebsites.net/sign-up";
		
		if (actualurl_nav_signup.equals(expectedurl_nav_signup))
		{
			System.out.println("Navigation to Sign Up through URL is Validation Successfully");
		}
		
		else
		{
		    System.out.println("Navigation to Sign Up Validation through URL is Failed");	
		}
		
	}
	
	@Test
	
	public void Test2() throws IOException {
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\SignUp\\Signinpage.png");
    	
    	FileUtils.copyFile(src, trg);
		
	    String actualtext_nav_signin = driver.findElement(By.xpath("//span[text() = 'Sign In']")).getText();
		
		String expectedtext_nav_signin = "Sign In";
		
		if (actualtext_nav_signin.equals(expectedtext_nav_signin))
			
		{
			System.out.println("Navigation to Sign In Page through Text is Validated Successfully");
		}
		
		else
		{
			System.out.println("Navigation to Sign In Page Validation through text is Failed");
		}
		
		String actualurl_nav_signin = driver.getCurrentUrl();
		
		String expectedurl_nav_signin = "https://uat-falkonsms-fe.azurewebsites.net/sign-in";
		
		if (actualurl_nav_signin.equals(expectedurl_nav_signin))
		{
			System.out.println("Navigation to Sign In through URL is Validation Successfully");
		}
		
		else
		{
		    System.out.println("Navigation to Sign In Validation through URL is Failed");	
		}
		
	}
	
	@Test
	
	public void Test3() throws IOException {
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(" ");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(" ");
		
	    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(" ");
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(" ");
		
		driver.findElement(By.xpath("//input[@placeholder='Organization']")).sendKeys(" ");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\SignUp\\DatawithSpace.png");
    	
    	FileUtils.copyFile(src, trg);
		
		String firstnamespace_actual = driver.findElement(By.xpath("//p[text()='First Name cannot be blank']")).getText();
		
		String firstnamespace_expected = "First Name cannot be blank";
		
		if (firstnamespace_actual.equals(firstnamespace_expected))
			
		{
			System.out.println("First Name with Space is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("First Name with Space Validation is Failed");
		}
		
	    String lastnamespace_actual = driver.findElement(By.xpath("//p[text()='Last Name cannot be blank']")).getText();
		
		String lastnamespace_expected = "Last Name cannot be blank";
		
		if (lastnamespace_actual.equals(lastnamespace_expected))
			
		{
			System.out.println("Last Name with Space is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("Last Name with Space Validation is Failed");
		}
		
	    String emailspace_actual = driver.findElement(By.xpath("//p[text()='Email cannot be blank']")).getText();
		
		String emailspace_expected = "Email cannot be blank";
		
		if (emailspace_actual.equals(emailspace_expected))
			
		{
			System.out.println("Email with Space is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("Email with Space Validation is Failed");
		}
		
	    String mobilespace_actual = driver.findElement(By.xpath("//p[text()='Mobile Number cannot be blank']")).getText();
		
		String mobilespace_expected = "Mobile Number cannot be blank";
		
		if (mobilespace_actual.equals(mobilespace_expected))
			
		{
			System.out.println("Mobile Number with Space is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("Mobile Number with Space Validation is Failed");
		}
		
	    String organizationspace_actual = driver.findElement(By.xpath("//p[text()='Organization name cannot be blank']")).getText();
		
		String organizationspace_expected = "Organization name cannot be blank";
		
		if (organizationspace_actual.equals(organizationspace_expected))
			
		{
			System.out.println("Organization Name with Space is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("Organization Name with Space Validation is Failed");
		}
		
	}
	
	@Test
	
	public void Test4() throws IOException {
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@gmail.c");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\SignUp\\Invalidemail.png");
    	
    	FileUtils.copyFile(src, trg);
		
	    String emailinvalid_actual = driver.findElement(By.xpath("//p[text()='Invalid Email']")).getText();
		
		String emailinvalid_expected = "Invalid Email";
		
		if (emailinvalid_actual.equals(emailinvalid_expected))
			
		{
			System.out.println("Invalid Email is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("Invalid Email Validation is Failed");
		}
		
		driver.navigate().refresh();
		
	    driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("1346262702");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
        TakesScreenshot ts1 = (TakesScreenshot) driver;
    	
    	File src1 = ts1.getScreenshotAs(OutputType.FILE);
    	
    	File trg1 = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\SignUp\\Invalidmobilenumber.png");
    	
    	FileUtils.copyFile(src1, trg1);
		
	    String mobileinvalid_actual = driver.findElement(By.xpath("//p[text()='Invalid Mobile Number']")).getText();
		
		String mobileinvalid_expected = "Invalid Mobile Number";
		
		if (mobileinvalid_actual.equals(mobileinvalid_expected))
			
		{
			System.out.println("Invalid Mobile Number is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("Invalid Mobile Number Validation is Failed");
		}
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("bhanupratapsinghbhanupratapsing");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
        TakesScreenshot ts2 = (TakesScreenshot) driver;
    	
    	File src2 = ts2.getScreenshotAs(OutputType.FILE);
    	
    	File trg2 = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\SignUp\\FirstNameLimit.png");
    	
    	FileUtils.copyFile(src2, trg2);
		
	    String firstnamelimit_actual = driver.findElement(By.xpath("//p[text()='First Name should not exceed 30 characters']")).getText();
		
		String firstnamelimit_expected = "First Name should not exceed 30 characters";
		
		if (firstnamelimit_actual.equals(firstnamelimit_expected))
			
		{
			System.out.println("First Name Limit is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("First Name Limit Validation is Failed");
		}
		
	    driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("bhanupratapsinghbhanupratapsing");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
        TakesScreenshot ts3 = (TakesScreenshot) driver;
    	
    	File src3 = ts3.getScreenshotAs(OutputType.FILE);
    	
    	File trg3 = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\SignUp\\LastNameLimit.png");
    	
    	FileUtils.copyFile(src3, trg3);
		
	    String lastnamelimit_actual = driver.findElement(By.xpath("//p[text()='Last Name should not exceed 30 characters']")).getText();
		
		String lastnamelimit_expected = "Last Name should not exceed 30 characters";
		
		if (lastnamelimit_actual.equals(lastnamelimit_expected))
			
		{
			System.out.println("Last Name Limit is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("Last Name Limit Validation is Failed");
		}
		
	}
	
    @AfterMethod
	
	public void AfterMethod() {
		
    System.out.println("Test Script Executed Successfully");
		
    driver.quit();
	
	}

}
