package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
public static void main(String args[])throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	driver.switchTo().frame("rightMenu");
	Select st=new Select(driver.findElement(By.name("loc_code")));
	//st.SelectByVisibleText("Emp.ID");
	//st.selectByIndex(1);
	st.selectByValue("0");
	Thread.sleep(3000);
	driver.findElement(By.name("loc_name")).sendKeys("0554");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("chkLocID[]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	Thread.sleep(3000);
	driver.close();
	
}
}
