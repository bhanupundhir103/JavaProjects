package SignUp;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageValidation {
	
	public static void main(String[] args){
		
//	ChromeOptions options = new ChromeOptions();
//	
//	options.setHeadless(false);
//	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
//	WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
	
	driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/']")).click();
	
	Set <String> WindowID01 = driver.getWindowHandles();
	
    List<String> WindowID011 = new ArrayList <String>(WindowID01);
	
	String parentwindowlist01 = WindowID011.get(0);
	
	String childwindowlist01 = WindowID011.get(1);
	
	driver.switchTo().window(childwindowlist01);
	
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
	
	driver.switchTo().window(childwindowlist01).close();
	
	driver.switchTo().window(parentwindowlist01);
	
    driver.findElement(By.xpath("//a[@href='https://www.facebook.com/falkonsystems2021']")).click();
	
	Set <String> WindowID02 = driver.getWindowHandles();
	
    List<String> WindowID021 = new ArrayList <String>(WindowID02);
	
	String parentwindowlist02 = WindowID021.get(0);
	
	String childwindowlist02 = WindowID021.get(1);
	
	driver.switchTo().window(childwindowlist02);
	
	String actualfacebookurl = driver.getCurrentUrl();
	
	String expectedfacebookurl = "https://www.facebook.com/falkonsystems2021";
	
	if (actualfacebookurl.equals(expectedfacebookurl))
		
	{
		System.out.println("Facebook url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Facebook Url Validation Failed");
	}
	
    driver.switchTo().window(childwindowlist02).close();
	
	driver.switchTo().window(parentwindowlist02);
	
    driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/falkon-systems/']")).click();
	
	Set <String> WindowID03 = driver.getWindowHandles();
	
    List<String> WindowID031 = new ArrayList <String>(WindowID03);
	
	String parentwindowlist03 = WindowID031.get(0);
	
	String childwindowlist03 = WindowID031.get(1);
	
	driver.switchTo().window(childwindowlist03);
	
	String actuallinkeldnurl = driver.getCurrentUrl();
	
	String expectedlinkedlnurl = "https://www.linkedin.com/company/falkon-systems/";
	
	if (actuallinkeldnurl.equals(expectedlinkedlnurl))
		
	{
		System.out.println("Linkeldn url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Linkeldn Url Validation Failed");
	}
	
	driver.switchTo().window(childwindowlist03).close();
	
    driver.switchTo().window(parentwindowlist03);
    
    driver.findElement(By.xpath("//a[@href='https://www.instagram.com/falkon_systems_/']")).click();
	
	Set <String> WindowID04 = driver.getWindowHandles();
	
    List<String> WindowID041 = new ArrayList <String>(WindowID04);
	
	String parentwindowlist04 = WindowID041.get(0);
	
	String childwindowlist04 = WindowID041.get(1);
	
	driver.switchTo().window(childwindowlist04);
	
	String actualinstagramnurl = driver.getCurrentUrl();
	
	String expectedinstagramurl = "https://www.instagram.com/falkon_systems_/";
	
	if (actualinstagramnurl.equals(expectedinstagramurl))
		
	{
		System.out.println("Instagram url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Instagram Url Validation Failed");
	}
	
	driver.switchTo().window(childwindowlist04).close();
	
    driver.switchTo().window(parentwindowlist04);
    
    driver.findElement(By.xpath("//a[@href='https://www.youtube.com/channel/UCP_hOtnoImVPCleutK9mLtA']")).click();
	
	Set <String> WindowID05 = driver.getWindowHandles();
	
    List<String> WindowID051 = new ArrayList <String>(WindowID05);
	
	String parentwindowlist05 = WindowID051.get(0);
	
	String childwindowlist05 = WindowID051.get(1);
	
	driver.switchTo().window(childwindowlist05);
	
	String actualyoutubeurl = driver.getCurrentUrl();
	
	String expectedyoutubeurl = "https://www.youtube.com/channel/UCP_hOtnoImVPCleutK9mLtA";
	
	if (actualyoutubeurl.equals(expectedyoutubeurl))
		
	{
		System.out.println("Youtube url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Youtube Url Validation Failed");
	}
	
	driver.switchTo().window(childwindowlist05).close();
	
    driver.switchTo().window(parentwindowlist05);
    
    driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/terms-of-service']")).click();
	
	Set <String> WindowID06 = driver.getWindowHandles();
	
    List<String> WindowID061 = new ArrayList <String>(WindowID06);
	
	String parentwindowlist06 = WindowID061.get(0);
	
	String childwindowlist06 = WindowID061.get(1);
	
	driver.switchTo().window(childwindowlist06);
	
	String actualtermsofserviceurl = driver.getCurrentUrl();
	
	String expectedtermsofserviceurl = "https://www.falkonsms.com/terms-of-service";
	
	if (actualtermsofserviceurl.equals(expectedtermsofserviceurl))
		
	{
		System.out.println("Terms of Service url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Terms of Service Url Validation Failed");
	}
	
	driver.switchTo().window(childwindowlist06).close();
	
    driver.switchTo().window(parentwindowlist06);
    
    driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/privacy-policy']")).click();
	
	Set <String> WindowID07 = driver.getWindowHandles();
	
    List<String> WindowID071 = new ArrayList <String>(WindowID07);
	
	String parentwindowlist07 = WindowID071.get(0);
	
	String childwindowlist07 = WindowID071.get(1);
	
	driver.switchTo().window(childwindowlist07);
	
	String actualprivacypolicyurl = driver.getCurrentUrl();
	
	String expectedprivacypolicyurl = "https://www.falkonsms.com/privacy-policy";
	
	if (actualprivacypolicyurl.equals(expectedprivacypolicyurl))
		
	{
		System.out.println("Privacy Policy url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Privacy Policy Url Validation Failed");
	}
	
	driver.switchTo().window(childwindowlist07).close();
	
    driver.switchTo().window(parentwindowlist07);
    
    driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/cookie-policy']")).click();
	
	Set <String> WindowID08 = driver.getWindowHandles();
	
    List<String> WindowID081 = new ArrayList <String>(WindowID08);
	
	String parentwindowlist08 = WindowID081.get(0);
	
	String childwindowlist08 = WindowID081.get(1);
	
	driver.switchTo().window(childwindowlist08);
	
	String actualcookiepolicyurl = driver.getCurrentUrl();
	
	String expectedcookiepolicyurl = "https://www.falkonsms.com/cookie-policy";
	
	if (actualcookiepolicyurl.equals(expectedcookiepolicyurl))
		
	{
		System.out.println("Cookie Policy url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Cookie Policy Url Validation Failed");
	}
	
	driver.switchTo().window(childwindowlist08).close();
	
    driver.switchTo().window(parentwindowlist08);
    
    driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/acceptable-use-policy']")).click();
	
	Set <String> WindowID09 = driver.getWindowHandles();
	
    List<String> WindowID091 = new ArrayList <String>(WindowID09);
	
	String parentwindowlist09 = WindowID091.get(0);
	
	String childwindowlist09 = WindowID091.get(1);
	
	driver.switchTo().window(childwindowlist09);
	
	String actualacceptableusepolicyurl = driver.getCurrentUrl();
	
	String expectetacceptableusepolicyurl = "https://www.falkonsms.com/acceptable-use-policy";
	
	if (actualacceptableusepolicyurl.equals(expectetacceptableusepolicyurl))
		
	{
		System.out.println("Acceptable Use Policy url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Acceptable Use Policy Url Validation Failed");
	}
	
	driver.switchTo().window(childwindowlist09).close();
	
    driver.switchTo().window(parentwindowlist09);
	
    String actualfalkonurl1 = driver.getCurrentUrl();
	
	String expectedfalkonurl1 = "https://uat-falkonsms-fe.azurewebsites.net/sign-in";

	if (actualfalkonurl1.equals(expectedfalkonurl1))

	{
		System.out.println("Falkon Url is Validated Successfully");
	}
	
	else
		
	{
		System.out.println("Falkon Url Validation Failed");
	}
	
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
	
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(" ");
	
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(" ");
	
    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(" ");
	
	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(" ");
	
	driver.findElement(By.xpath("//input[@placeholder='Organization']")).sendKeys(" ");
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
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
	
	
	
	// driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.navigate().refresh();
	
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@gmail.c");
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
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
	
    driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
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
	
	System.out.println("Test Script Executed Successfully");
	
	driver.quit();
	
}
	
}
