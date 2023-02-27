package Data_control;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class User 
{
@DataProvider(name="users")
public Object[][] userdata() throws IOException
{
	return new DC_Excel().customer_DC();
}
	
	
	
}
