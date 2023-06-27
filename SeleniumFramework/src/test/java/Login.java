import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) {
		
		// System.setProperty("WebDriver.gecko.driver", "C:\\Users\\bhanu\\Desktop\\JavaProjects\\SeleniumFramework\\Drivers\\GeckoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");

	}

}
