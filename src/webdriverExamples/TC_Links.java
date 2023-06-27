package webdriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Links {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.navigate().to("https://www.google.com/");
List<WebElement>links = driver.findElements(By.tagName("a"));
for(WebElement link:links) {
	System.out.println(link.getText());
	Thread.sleep(2000);
}
driver.quit();
	}

}
