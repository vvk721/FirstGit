package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.assertEquals;
public class TC_Drag_Drop {

	public static void main(String args[])throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://jqueryui.com/droppable/&quot");
Thread.sleep(3000);
assertEquals(driver.getTitle(),"Droppable | jQuery UI");
System.out.println("Title matched");
Thread.sleep(3000);
driver.switchTo().frame(0);
Actions ac = new Actions(driver);
ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
Thread.sleep(3000);
System.out.println("Drag & Drop");
driver.switchTo().defaultContent();
driver.close();
	}

	}


