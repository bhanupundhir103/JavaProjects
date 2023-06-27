import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	
	public static void main (String []args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://uat-falkonsms-fe.azurewebsites.net/sign-in");
		
		driver.findElement(By.id("username")).sendKeys("Sysadm.uat@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Uat@@123");
		
		driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]/parent::button")).click();
		
	}

}