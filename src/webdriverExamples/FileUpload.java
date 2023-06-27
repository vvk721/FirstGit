package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(5000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"txtEmpLastName\"]")).sendKeys("last name");
driver.findElement(By.xpath("//html/body/form/div/div[1]/div[2]/input[3]")).sendKeys("first name");
System.out.println("Aftre first name");
WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
System.out.println("After xpath of choose file");
fileInput.sendKeys("E:\\aaaaaavivek FORM document\\vivek.jpg");
Thread.sleep(6000);
System.out.println("File uploadfed successfully");
driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
Thread.sleep(6000);
System.out.println("New Employee Added");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();

	}

}
