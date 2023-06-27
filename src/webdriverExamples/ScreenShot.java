package webdriverExamples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
public static void main(String args[])throws Exception{
	WebDriver driver = new FirefoxDriver();
	try   {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		WebElement elemnt = driver.findElement(By.linkText("PIM"));
		Actions action = new Actions(driver);
		action.moveToElement(elemnt).perform();
		//action.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("vivek");
		Thread.sleep(3000L);
		driver.findElement(By.linkText("Add Employee 123")).click();
		Thread.sleep(4000);
		System.out.println("Clicked on submenu");
		driver.findElement(By.linkText("Logout")).click();
	}
	catch(Exception e)    {
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("E:\\aaaaaavivek FORM document\\2022-05-05 at 3.59.25 PM.jpeg"));
	}
	driver.quit();
	}
}

