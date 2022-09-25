package sep8;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile {
	WebDriver driver;
	Properties p;
	@BeforeTest
	public void setUp() throws Throwable{
		p = new Properties();
		p.load(new FileInputStream("D:\\SeleniumPrograms\\TestNG_FrameWork\\Primus.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("Url"));
		Thread.sleep(3000);
		
	}
	@Test
		public void login()
		{
			driver.findElement(By.xpath(p.getProperty("objuser"))).sendKeys("Admin");
			driver.findElement(By.xpath(p.getProperty("objpass"))).sendKeys("Admin");
			driver.findElement(By.xpath(p.getProperty("objlogin"))).click();
			
		}
	}
	



