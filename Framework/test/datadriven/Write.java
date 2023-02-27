package datadriven;

import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write
{
public static void main(String args[]) throws Exception
{
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet= workbook.createSheet("sheet1");
	
	Object empdata[][]= {  {"EmpID","Name","Job"},
			{101,"jothi","employee"},
			{102,"sai","engineer"},
			{103,"sarvesh","doctor"}
	};
	
	int rows=empdata.length;
	int cols=empdata[0].length;
	
	System.out.println(rows);
	System.out.println(cols);
	
	for(int r=0;r<rows;r++)
	{
		XSSFRow row= sheet.createRow(r);
	for(int c=0;c<cols;c++)
	{
		
		XSSFCell cell=row.createCell(c);
		Object value=empdata[r][c];
		
		    if(value instanceof String)
			  cell.setCellValue((String)value);
			if(value instanceof Integer)
			  cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
			  cell.setCellValue((Boolean)value);
	}
	}
	String filepath=".D:\\excel\\write.xlsx";
	FileOutputStream outstream=new FileOutputStream(filepath);
	workbook.write(outstream);
	
	outstream.close();
	
	System.out.println("write.xlsx file written");
	workbook.close();	
}
}
	

