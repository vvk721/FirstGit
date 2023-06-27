package com.hrms.pages07;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility07.BaseClass;

public class LogoutPage extends BaseClass{
static By link_logout = By.linkText("Logout");
public static void logout() {
	driver.findElement(link_logout).click();
	Reporter.log("Logout completed");
	
}
}
