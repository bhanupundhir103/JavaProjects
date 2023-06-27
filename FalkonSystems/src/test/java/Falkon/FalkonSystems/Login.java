package Falkon.FalkonSystems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	static LoginPage lp;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		lp = new LoginPage(driver);
		lp.username("Sysadm.uat@gmail.com");
		lp.password("Uat@@123");
		lp.signin();
		driver.quit();
	}

}
