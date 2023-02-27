package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features="resourse/feature",
	glue="stepdefinition"
		
	)

public class Testrunner extends AbstractTestNGCucumberTests
{
	

}

	
	
	

