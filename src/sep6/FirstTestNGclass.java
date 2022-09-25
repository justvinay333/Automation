package sep6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;


public class FirstTestNGclass {
	WebDriver driver;
  @BeforeTest
  public void beforeTest() throws Throwable {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.w3schools.com/js/default.asp");
	  Thread.sleep(30000);
	  Reporter.log("Running in Precondition", true);
  }
  @Test
  public void minny() throws Throwable {
	  driver.findElement(By.partialLinkText("JavaScript")).click();
	  Thread.sleep(3000);
	  //driver.navigate().back();
	  Reporter.log("Running in Minny ",true);
  }
  @Test
  public void vinay() throws Throwable{
	  driver.findElement(By.partialLinkText("SQL")).click();
	  Thread.sleep(3000);
	  Reporter.log("Running in Vinay",true);
  }
  @Test
  public void vd() throws Throwable{
	  driver.findElement(By.partialLinkText("Python")).click();
	  Thread.sleep(3000);
	  Reporter.log("Running in vd",true);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  Reporter.log("Running in Post Condition",true);
  }

}
