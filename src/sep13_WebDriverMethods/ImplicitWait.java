package sep13_WebDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(10000);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Minny");
		driver.close();
		
		
	}

}
