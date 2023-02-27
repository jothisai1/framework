package datadriven;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Excelsheet 
{

	String [][] data=null;
	WebDriver driver;
	
	@DataProvider(name="logindata");
	public String[][] logindataprovider()
	
	data=getexceldata();
}
