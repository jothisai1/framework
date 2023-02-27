package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Testcaseobject {

	@Test
	public void login() throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=51ul6e287tlf1");
		Thread.sleep(1000);
		
		PageFactory.initElements(driver, Loginpageobject.class);
		
		Loginpageobject.username.sendKeys("admin");
		Loginpageobject.password.sendKeys("manager");
		Loginpageobject.loginButton.click();
	
		Loginpageobject.user.click();
		Loginpageobject.createnewuser.click();
		Loginpageobject.username1.sendKeys("automation");
		
	}	
		
}
		
		/*Loginpageobject.username(driver).sendKeys("admin");
		Loginpageobject.password(driver).sendKeys("manager");
		Loginpageobject.loginButton(driver).click();	*/	
