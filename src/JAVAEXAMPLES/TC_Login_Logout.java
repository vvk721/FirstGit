package JAVAEXAMPLES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_Login_Logout {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php&quot");
	}

}
