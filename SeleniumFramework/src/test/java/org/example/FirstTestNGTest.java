package org.example;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
// import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.BeforeTest;

public class FirstTestNGTest {
public String baseUrl = "https://uat-falkonsms-fe.azurewebsites.net/sign-in";
//String driverPath = "D:\\Selenium\\chromedriver.exe";
public WebDriver driver ;

@BeforeMethod
public void launchBrowser() {
System.out.println("launching Chrome browser");
//System.setProperty("webdriver.chrome.driver", driverPath);
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(baseUrl);
}

@Test

public void verifyHomepageTitle() {
String expectedTitle = "Falkon SMS";
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);
};

@Test

public void verifyLoginpage() {
	
	driver.findElement(By.id("username")).sendKeys("Sysadm.uat@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Uat@@123");
	driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]/parent::button")).click();
	String expectedTitle = "Falkon SMS";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
}

@SuppressWarnings("deprecation")
@Test

public void verifySigninpage() {
	
	driver.findElement(By.id("username")).sendKeys("Sysadm.uat@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Uat@@123");
	driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]/parent::button")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[contains(text(), 'Organizations')]")).click();
	driver.findElement(By.xpath("//span[contains(text(), 'Add Organization')]")).click();
}

@AfterMethod
public void terminateBrowser(){
driver.close();
}
}