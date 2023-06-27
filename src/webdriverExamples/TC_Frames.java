package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Frames {
public static void main (String args[]) throws Exception{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(5000);
	driver.switchTo().frame("rightMenu");
	System.out.println("entered frame");
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
	System.out.println("After PIM");
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("biru");
    driver.findElement(By.name("txtEmpLastName")).sendKeys("sesh");
    driver.findElement(By.id("btnEdit")).click();
    Thread.sleep(3000);
    System.out.println("New emp added");
    driver.switchTo().defaultContent();
    driver.findElement(By.linkText("Logout")).click();
    Thread.sleep(3000);
    driver.close();
}
}
