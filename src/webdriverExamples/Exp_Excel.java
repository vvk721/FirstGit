package webdriverExamples;

import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;

public class Exp_Excel {
	public static void main(String args[]) throws Exception{
		FileInputStream file = new FileInputStream("F:\\vivk.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet   st = wb.getSheet(0);
		int row = 2;
		String empid = st.getCell(0,row).getContents();
		String name = st.getCell(1,row).getContents();
		String email = st.getCell(2,row).getContents();
		String no = st.getCell(3,row).getContents();
		System.out.println(empid+"||"+name+"||"+email+"||"+no);
		
	}

}
