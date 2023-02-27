package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException
	{
	String excelfilepath="D:\\excel\\excelx2.xlsx";
	FileInputStream inputStream=new FileInputStream(excelfilepath);
	
	XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
	XSSFSheet sheet1=(workbook.getSheetAt(0));
	
	int rowcount=sheet1.getPhysicalNumberOfRows();
	for(int i=0;i<rowcount;i++)
	{
		XSSFRow row=sheet1.getRow(i);
		
		int cellcount=row.getPhysicalNumberOfCells();
		for(int j=0;j<cellcount;j++)
			{
			XSSFCell cell=row.getCell(j);
			String cellvalue=getcellvalue(cell);
			System.out.println("||"+cellvalue);
			}
		System.out.println();
			}
	workbook.close();
	inputStream.close();
	}
public static String getcellvalue(XSSFCell cell)
{
	switch(cell.getCellType())
	{
	case NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
	case BOOLEAN:
		return String.valueOf(cell.getBooleanCellValue());
	case STRING:
		return String.valueOf(cell.getStringCellValue());
    default:
    	return cell.getStringCellValue();
	}}}