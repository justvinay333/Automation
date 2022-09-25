package sep7;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.AppUtil1;

public class ThirdTestNGClass extends AppUtil1 {
	@Test
	public void branches() throws Throwable {
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void roles() throws Throwable{
		driver.findElement(By.xpath("//img[@src='images/Roles_but.jpg']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void users() throws Throwable {
		driver.findElement(By.xpath("//img[@src='images/Users_but.jpg']")).click();
		Thread.sleep(3000);
	}

}
