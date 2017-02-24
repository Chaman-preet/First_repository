package Git_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Git_class {

	@Test
	public void search_google() {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
//driver.get("https://google.com");
driver.navigate().to("http://google.com");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.id("lst-ib")).sendKeys("selenium tutorial");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("btnK")).click();
System.out.println("Data has been searched");
	}

}
