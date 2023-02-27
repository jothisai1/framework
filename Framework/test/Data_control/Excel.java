package Data_control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Excel 
{

	public WebDriver driver=null;
	
	@BeforeMethod
	@Parameters({"browser","url","username","password"})
	public void login(String browser,String url,String username,String password)
	{
		switch (browser)
		{
		case"chrome":
			driver=new ChromeDriver();
			break;
		case"edge":
			driver=new EdgeDriver();
			break;
		}
		driver.get("http://127.0.0.1/login.do;jsessionid=1jamgor66w9th");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
	}
	@AfterMethod
		public void logout()
		{
		driver.close();	
	}
	public Object[][] customer() {
		// TODO Auto-generated method stub
		return null;
	}
}
	

