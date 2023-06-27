package Falkon.FalkonSystems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
    	String url = driver.getCurrentUrl();
        System.out.println(url);
    }
}
