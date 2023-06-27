package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LoginLogout1 {
static String url = "http://183.82.103.245/nareshit/login.php";
static String username = "nareshit";
static String password = "nareshit";
static String title1 = "OrangeHRM - New Level of HR Management";
static String title2 = "OrangeHRM";
public static void main(String args[]) throws Exception{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	if(driver.getTitle().equals(title1)) {
		System.out.println("Title matched");
		
	}
	else{
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	if(driver.getTitle().equals(title2)) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		
	}
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	Thread.sleep(3000);
	driver.close();
	driver.findElement(By.name("Submit")).click();
}
}