package sep7;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.AppUtil;

public class SecondTestNGClass extends AppUtil {
	@Test(invocationCount = 3)
	public void multiplication() throws Throwable {
		driver.findElement(By.name("display")).sendKeys("630");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("851");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String runtimevalue = driver.findElement(By.name("display")).getAttribute("value");
		System.out.println(runtimevalue);
		
	}
	@Test //(enabled = false)
	public void addition() throws Throwable {
		driver.findElement(By.name("display")).sendKeys("630");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("851");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String runtimevalue1 = driver.findElement(By.name("display")).getAttribute("value");
		System.out.println(runtimevalue1);

}
	@Test //(priority = 2)
	public void division() throws Throwable {
		driver.findElement(By.name("display")).sendKeys("630");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("851");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String runtimevalue2 = driver.findElement(By.name("display")).getAttribute("value");
		System.out.println(runtimevalue2);
		
	}
}
