package page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
WebDriver driver=null;
@FindBy(name="username")
private WebElement un;

@FindBy(name="pwd")
private WebElement pwd;

@FindBy(xpath ="//a[@id='loginButton']")
private WebElement login();

public WebElement username()
{
	return un;
}
	
public WebElement password()
{
	return pwd;
}
	
public WebElement login1()
{
return login();	
}

public void login(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(this.driver, driver);
}
	
}
