package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
WebDriver driver;

@Given("^user is login to ACTITIME$")
public void user_is_login_to_actitime()
{
	driver=new ChromeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=xb0y8pabi3c");
}

@When("^user verify title of ACTITIME$")
public void user_verify_title_of_atitime()
{
	Assert.assertEquals(driver.getTitle(),"actiTIME - Login");
}

@Then("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_and(String username,String password)
{
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
}
	
@Then("^user clicks on login button$")
public void verify_login() 
{
	driver.findElement(By.id("loginButton")).click();

}

@Then("^user is on Homepage$")
public void verifyhomepage() throws InterruptedException
{
	Thread.sleep(2000);
	Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
}

@And("^close the ACTITIME$")
public void close()
{
	driver.close();
}
}
