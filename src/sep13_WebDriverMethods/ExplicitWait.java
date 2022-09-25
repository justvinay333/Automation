package sep13_WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(10000);
	    //driver.manage().timeouts().ExplicitlyWait(10,TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-testid='open-registration-form-button']")));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	    //driver.findElement(By.xpath("")).click();
		driver.findElement(By.name("firstname")).sendKeys("Minny");
		driver.close();
		

	}

}
