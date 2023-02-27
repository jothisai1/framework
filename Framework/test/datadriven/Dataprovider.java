package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
String[][] data= {
		{"admin","manager"},
		{"admin1","manager"},
		{"admin","dummy"},
		{"amma","dummy"}
};
	

@DataProvider(name="login")
	public String[][] logindataprovider()
	{
		return data;
	}
	
@Test(dataProvider ="login")
public void loginbothcorrect(String username,String password)
{
	System.setProperty("webdriver.chromedriver", "C:\\Program Files (x86)\\Google\\"
			+ "Chrome\\Application\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=1jamgor66w9th");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	
	driver.quit();
}

	
	
}
