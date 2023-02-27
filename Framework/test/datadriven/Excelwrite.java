package datadriven;

import java.io.File;


import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {

	public static void main (String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("testsheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("hello");
		sheet.getRow(0).createCell(1).setCellValue("world");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("hi");
		sheet.getRow(1).createCell(1).setCellValue("hiiiii");
		
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("hijjjjj");
		sheet.getRow(2).createCell(1).setCellValue("hiiiii");
		

		File file=new File ("D:\\excel\\excelx2.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	}

}
