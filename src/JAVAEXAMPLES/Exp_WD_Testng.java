package JAVAEXAMPLES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_WD_Testng {
WebDriver driver;
@BeforeClass
public void startUp() {
	driver = new FirefoxDriver();
	
}
@AfterClass
public void tearDown() {
driver.close();
}
@Test
public void tc001()throws Exception{
	FileInputStream file=new FileInputStream("F:\\vivk.xls");
	Workbook wb = Workbook.getWorkbook(file);
	Sheet st =wb.getSheet(0);
	String username = st.getCell(0,1).getContents();
	String password = st.getCell(1,1).getContents();
	Reporter.log(username);
	Reporter.log(password);
	driver.navigate().to("");
	System.out.println("Application Opened");
	Reporter.log("Application opened");
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.name("")).click();
	System.out.println("Login completed");
	Reporter.log("Login completed");
	Reporter.log(driver.getTitle());
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed");
}
}
