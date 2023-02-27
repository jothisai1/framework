package datadriven;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("D:\\excel\\excelx2.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheetAt(0);
	
	int rowcount=sheet.getLastRowNum();
	int colcount=sheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<rowcount;i++)
	{
		XSSFRow currentrow=sheet.getRow(i);
		for(int j=0;j<colcount;j++)
		{
		String value=currentrow.getCell(j).toString();
		System.out.println("  "+value);
		}
		System.out.println();
		}
workbook.close();
	}

}
