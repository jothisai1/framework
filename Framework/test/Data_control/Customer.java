package Data_control;

import org.testng.annotations.Test;

public class Customer 
{
@Test(dataProvider = "users",dataProviderClass = Data_control.User.class)
public void createcustomer(String un,String pwd,String custname,String custdesig)
{
	System.out.println("create customer for amazon");
}	
	
}
