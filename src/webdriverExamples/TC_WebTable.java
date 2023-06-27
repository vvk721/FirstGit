package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WebTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("file:///C:/Users/Administrator/Downloads/WebTable.html");
int row = driver.findElement(By.xpath("/html/body/table/tbody/tr")).hashCode();
int col = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td")).hashCode();
int row_col=driver.findElement(By.xpath("/html/body/table/tbody/tr/td")).hashCode();
System.out.println("Row Count"+row);
System.out.println("Col Count"+col);
System.out.println("Row_Col Count"+row_col);
String celldata=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
System.out.println(celldata);
for(int i=1;i<=row;i++) {
	String data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getText();
	System.out.println(data);
	Thread.sleep(3000);
}
driver.close();
}
	}


