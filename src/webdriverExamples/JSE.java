package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSE {
public static void main(String args[])throws Exception{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
WebElement loginbtn=driver.findElement(By.name("Submit"));
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();",loginbtn);
Thread.sleep(4000);
System.out.println("Login completed");
WebElement logout=driver.findElement(By.linkText("Logout"));
JavascriptExecutor executor1=(JavascriptExecutor)driver;
executor1.executeScript("arguments[0].click();",logout);
System.out.println("Logout completed");
driver.close();
}
}
