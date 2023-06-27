package com.hrms.testscripts;
import com.hrms.lib.General;

import org.testng.annotations.Test;

public class TC002 {
@Test
public void tc002() {
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.addNewEmp();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
}
}
