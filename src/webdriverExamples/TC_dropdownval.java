package webdriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_dropdownval {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
Select st = new Select(driver.findElement(By.name("loc_code")));
List<WebElement>dropval = st.getOptions();
for(WebElement dpv:dropval) {
	System.out.println(dpv.getText());
	
	Thread.sleep(3000);
}
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();
	}

}
