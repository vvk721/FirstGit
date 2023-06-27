package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Checkbox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(5000);
driver.switchTo().frame("rightMenu");
for(int i=1; i<=10; i=i+2) {
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[1]/td[1]/input")).click();
		System.out.println("clicked on checkbox of-"+i);
	Thread.sleep(3000);
	
}
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();


	}

}
