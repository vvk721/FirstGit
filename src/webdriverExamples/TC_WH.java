package webdriverExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WH {
public static void main(String args[])throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Administrator/Downloads/multiplewindows.html");
	Thread.sleep(3000);
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String>windinfo=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windinfo.get(0));
	Thread.sleep(3000);
	driver.quit();
}
}
