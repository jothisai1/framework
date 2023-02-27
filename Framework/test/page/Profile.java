package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {
             
	public static void main(String[] args) throws InterruptedException {
	   
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://127.0.0.1/login.do;jsessionid=51ul6e287tlf1");
       driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[@class='content users']//img[@class='sizer']")).click();
      
       driver.findElement(By.xpath("//input[@value='Create New User']")).click();
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("automation");
	}
}
