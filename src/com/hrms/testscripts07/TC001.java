package com.hrms.testscripts07;

import org.testng.annotations.Test;

import com.hrms.pages07.LoginPage;
import com.hrms.pages07.LogoutPage;
import com.hrms.pages07.Verifypage;
import com.hrms.utility07.BaseClass;

public class TC001 {
@Test
public static void tc001() {
	BaseClass.openApplication();
	Verifypage.verifyTitle("HRMS");
	LoginPage.login("nareshit","nareshit");
	Verifypage.verifyTitle("OrangeHRM");
	LogoutPage.logout();
	BaseClass.closeApp();
}
}
