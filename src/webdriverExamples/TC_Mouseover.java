package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Mouseover {
public static void main(String args[])throws Exception{
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
System.out.println("Mouseover completed");
Thread.sleep(4000);
driver.findElement(By.linkText("Add Employee")).click();
System.out.println("Clicked on Submenu");
Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout completed");
Thread.sleep(3000);
driver.close();
}
}
