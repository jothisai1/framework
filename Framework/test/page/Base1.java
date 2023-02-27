package page;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import pageobject.Loginpageobject;

public class Base1 

{
	public void login() throws InterruptedException
	{
		
	
	WebDriver driver =new ChromeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=1jamgor66w9th");
	Thread.sleep(2000);
	
	
	
		PageFactory.initElements(driver, Pagefactory.class);
			
	Pagefactory.username.sendKeys("admin");
	Pagefactory.pwd.sendKeys("manager");
	Pagefactory.login.click();
}}




