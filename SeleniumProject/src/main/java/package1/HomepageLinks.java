package package1;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageLinks {
	
	private static final String TakesScreenshot = null;
	WebDriver driver = null;

	@BeforeMethod
	public void BeforeTest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@Test (enabled = true)
	
	public void Test1() throws IOException {
		
        driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actualwebsiteurl = driver.getCurrentUrl();
    	
    	String expectedwebsiteurl = "https://www.falkonsms.com/";
    	
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Websiteurl.png");
    	
    	FileUtils.copyFile(src, trg);
    	
    	if (actualwebsiteurl.equals(expectedwebsiteurl))
    		
    	{
    		System.out.println("Website Url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Website Url Validation Failed");
    	}
    	
    	// Assert.assertEquals(actualwebsiteurl, expectedwebsiteurl, "Website url is different");
    	
    	driver.switchTo().window(childwindowlist).close();
    	
    	driver.switchTo().window(parentwindowlist);
    	
    }
	
	@Test (enabled = true)
	
	public void Test2() throws IOException {
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/falkonsystems2021']")).click();
		
		Set <String> WindowID01 = driver.getWindowHandles();
		
	    List<String> WindowID02 = new ArrayList <String>(WindowID01);
		
		String parentwindowlist = WindowID02.get(0);
		
		String childwindowlist = WindowID02.get(1);
		
		driver.switchTo().window(childwindowlist);
		
		String actualfacebookurl = driver.getCurrentUrl();
		
		String expectedfacebookurl = "https://www.facebook.com/falkonsystems2021";
		
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Facebookurl.png");
    	
    	FileUtils.copyFile(src, trg);
		
		if (actualfacebookurl.equals(expectedfacebookurl))
			
		{
			System.out.println("Facebook url is Validated Successfully");
		}
		
		else
			
		{
			System.out.println("Facebook Url Validation Failed");
		}
		
	    driver.switchTo().window(childwindowlist).close();
		
		driver.switchTo().window(parentwindowlist);
		
	}
	
    @Test
	
	public void Test3() throws IOException {
    	
    	driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/falkon-systems/']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actuallinkeldnurl = driver.getCurrentUrl();
    	
    	String expectedlinkedlnurl = "https://www.linkedin.com/company/falkon-systems/";
    	
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Linkeldnurl.png");
    	
    	FileUtils.copyFile(src, trg);
    	
    	if (actuallinkeldnurl.equals(expectedlinkedlnurl))
    		
    	{
    		System.out.println("Linkeldn url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Linkeldn Url Validation Failed");
    	}
    	
    	driver.switchTo().window(childwindowlist).close();
    	
        driver.switchTo().window(parentwindowlist);
        
    }
    
    @Test
    
    public void Test4() throws IOException {
    	
    	driver.findElement(By.xpath("//a[@href='https://www.instagram.com/falkon_systems_/']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actualinstagramnurl = driver.getCurrentUrl();
    	
    	String expectedinstagramurl = "https://www.instagram.com/falkon_systems_/";
    	
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Instagramurl.png");
    	
    	FileUtils.copyFile(src, trg);
    	
    	if (actualinstagramnurl.equals(expectedinstagramurl))
    		
    	{
    		System.out.println("Instagram url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Instagram Url Validation Failed");
    	}
    	
    	driver.switchTo().window(childwindowlist).close();
    	
        driver.switchTo().window(parentwindowlist);
    }
    
    @Test
    
    public void Test5() throws IOException {
    	
    	driver.findElement(By.xpath("//a[@href='https://www.youtube.com/channel/UCP_hOtnoImVPCleutK9mLtA']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actualyoutubeurl = driver.getCurrentUrl();
    	
    	String expectedyoutubeurl = "https://www.youtube.com/channel/UCP_hOtnoImVPCleutK9mLtA";
    	
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Youtubeurl.png");
    	
    	FileUtils.copyFile(src, trg);
    	
    	if (actualyoutubeurl.equals(expectedyoutubeurl))
    		
    	{
    		System.out.println("Youtube url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Youtube Url Validation Failed");
    	}
    	
    	driver.switchTo().window(childwindowlist).close();
    	
        driver.switchTo().window(parentwindowlist);
        
    }
    
    @Test
    
    public void Test6() throws IOException {
    	
    	driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/terms-of-service']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actualtermsofserviceurl = driver.getCurrentUrl();
    	
    	String expectedtermsofserviceurl = "https://www.falkonsms.com/terms-of-service";
    	
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Termsofserviceurl.png");
    	
    	FileUtils.copyFile(src, trg);
    	
    	if (actualtermsofserviceurl.equals(expectedtermsofserviceurl))
    		
    	{
    		System.out.println("Terms of Service url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Terms of Service Url Validation Failed");
    	}
    	
    	driver.switchTo().window(childwindowlist).close();
    	
        driver.switchTo().window(parentwindowlist);
    	
    }
    
    @Test
    
    public void Test7() throws IOException {
    	
    	driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/privacy-policy']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actualprivacypolicyurl = driver.getCurrentUrl();
    	
    	String expectedprivacypolicyurl = "https://www.falkonsms.com/privacy-policy";
    	
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Privacypolicyurl.png");
    	
    	FileUtils.copyFile(src, trg);
    	
    	if (actualprivacypolicyurl.equals(expectedprivacypolicyurl))
    		
    	{
    		System.out.println("Privacy Policy url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Privacy Policy Url Validation Failed");
    	}
    	
    	driver.switchTo().window(childwindowlist).close();
    	
        driver.switchTo().window(parentwindowlist);
    	
    }
    
    @Test
    
    public void Test8() throws IOException {
    	
    	driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/cookie-policy']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actualcookiepolicyurl = driver.getCurrentUrl();
    	
    	String expectedcookiepolicyurl = "https://www.falkonsms.com/cookie-policy";
    	
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Cookiepolicyurl.png");
    	
    	FileUtils.copyFile(src, trg);
    	
    	if (actualcookiepolicyurl.equals(expectedcookiepolicyurl))
    		
    	{
    		System.out.println("Cookie Policy url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Cookie Policy Url Validation Failed");
    	}
    	
    	driver.switchTo().window(childwindowlist).close();
    	
        driver.switchTo().window(parentwindowlist);
        
    }
    
    @Test
    
    public void Test9() throws IOException {
    	
    	driver.findElement(By.xpath("//a[@href='https://www.falkonsms.com/acceptable-use-policy']")).click();
    	
    	Set <String> WindowID01 = driver.getWindowHandles();
    	
        List<String> WindowID02 = new ArrayList <String>(WindowID01);
    	
    	String parentwindowlist = WindowID02.get(0);
    	
    	String childwindowlist = WindowID02.get(1);
    	
    	driver.switchTo().window(childwindowlist);
    	
    	String actualacceptableusepolicyurl = driver.getCurrentUrl();
    	
    	String expectetacceptableusepolicyurl = "https://www.falkonsms.com/acceptable-use-policy";
    	
        TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	File trg = new File ("C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumProject\\Screenshots\\Homepagelinks\\Acceptableusepolicyurl.png");
    	
    	FileUtils.copyFile(src, trg);
    	
    	if (actualacceptableusepolicyurl.equals(expectetacceptableusepolicyurl))
    		
    	{
    		System.out.println("Acceptable Use Policy url is Validated Successfully");
    	}
    	
    	else
    		
    	{
    		System.out.println("Acceptable Use Policy Url Validation Failed");
    	}
    	
    	driver.switchTo().window(childwindowlist).close();
    	
        driver.switchTo().window(parentwindowlist);
    }
	
	@AfterMethod
	
	public void AfterTest() throws IOException {
		
    System.out.println("Test Script Executed Successfully");
		
    driver.quit();
	
	}
	
}
