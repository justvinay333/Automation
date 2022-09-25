package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtil {
	public static WebDriver driver;
    @BeforeMethod
    public static void setUp() throws Throwable{
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://calc.qedgetech.com/");
    	Thread.sleep(3000);
    	
    }
    @AfterMethod
    public static void tearDown() {
    	driver.close();
    }
	

}
