package JAVAEXAMPLES;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Testng {
@BeforeClass
public void login() {
	System.out.println("login complited");
} 
@AfterClass
public void logout() {
	System.out.println("logout completwed");
	
}
@Test(priority=2)
public void addemp() {
	System.out.println("Add new emp");
	
}
@Test(priority=1)
public void delemp() {
	System.out.println("delete emp");
}
}
