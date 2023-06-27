package com.hrms.utility07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {
static public WebDriver driver;
public static void openApplication() {
	driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application Opened");
}
public static void closeApp() {
	driver.quit();
	Reporter.log("Application closed");
}
}
