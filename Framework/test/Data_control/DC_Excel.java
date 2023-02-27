package Data_control;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DC_Excel
{

	public Object[][] customer_DC() throws IOException
	{
		FileInputStream fi=new FileInputStream("D:\\excel\\excelxl.xlsx");
		Workbook workbook=new XSSFWorkbook(fi);
	
		XSSFSheet sh=(XSSFSheet) workbook.getSheet("Sheet1");
		DataFormatter df=new DataFormatter();
		Object[][] obj=new Object[sh.getLastRowNum()-1][sh.getRow(0).getLastCellNum()];
		for(int i=1;i<=obj.length;i++)
		{
			for(int j=0;j<=obj[0].length-1;j++)
			{
				obj[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
				
			}
		}
		return obj;
	}
}

