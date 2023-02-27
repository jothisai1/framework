package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagefactory 
{
	public class login
	{
		WebDriver driver=null;
		@FindBy(name="username")
		private WebElement un;
		
		@FindBy(name="pwd")
	    private WebElement pwd;
		
		@FindBy(xpath = "//a[@id='loginButton']")
		private WebElement login;
		
		public WebElement username()
		{
			return un;
		}
		public WebElement password()
		{
			return pwd;
		}
		
		public WebElement loginButton()
		{
			return pwd;
	
		}
	
		
	}

	
}
