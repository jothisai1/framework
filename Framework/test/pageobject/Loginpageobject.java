package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobject {
    @FindBy(name="username")
	public static WebElement username;
    
    @FindBy(name="pwd")
	public static WebElement password;
    
    @FindBy(id="loginButton")
	public static WebElement loginButton;

    @FindBy(xpath="//a[@class='content users']//img[@class='sizer']")
    public static WebElement user;
    
    @FindBy(xpath="//input[@value='Create New User']")
    public static WebElement createnewuser;
    
    @FindBy(xpath="//input[@name='username']")
    public static WebElement username1;
    
    
   
    
    
    
    
    
	/*public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.name("username"));
	}
     
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("pwd"));
	}
	public static WebElement loginButton(WebDriver driver)
	{
		return driver.findElement(By.id("loginButton"));
	}*/
}
