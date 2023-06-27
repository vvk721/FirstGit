package com.hrms.testscripts;
import com.hrms.lib.General;

import org.testng.annotations.Test;

public class TC001 {
@Test
public void tc001() {
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
}
}
