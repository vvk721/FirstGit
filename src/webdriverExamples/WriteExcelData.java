package webdriverExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception{
		System.out.println("main start");
		// TODO Auto-generated method stub
		FileInputStream fileinput = new FileInputStream("F:\\Book41.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		System.out.println("after file");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data"+sheet.getRow(2).getCell(1));
		XSSFCell cell = sheet.getRow(2).getCell(1);
		cell.setCellValue("Test124");
		fileinput.close();
		FileOutputStream fileOut = new FileOutputStream("F:\\Book41.xlsx");
		workbook.write(fileOut);
		System.out.println("Updated data after write is done"+ cell.getStringCellValue());
		fileOut.close();

	}

}
