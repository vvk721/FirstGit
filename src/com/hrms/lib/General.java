package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global{
public void openApplication() {
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application opened");
	
}
public void closeApplication() {
	driver.close();
	System.out.println(("Application closed"));
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("login completed");
}
public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	
}
public void enterFrame() {
	driver.switchTo().frame(frame_empinfo);
}
public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit from frame");
}             
public void addNewEmp() {
	driver.findElement(By.xpath(btn_add)).click();
	driver.findElement(By.name(txt_efn)).sendKeys(efn);
	driver.findElement(By.name(txt_eln)).sendKeys(eln);
	driver.findElement(By.id(btn_save)).click();
	System.out.println("Adding new emp");
}
}
