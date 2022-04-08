package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
features = {"E:\\Test_Frameworks\\9pm_01-04-2022\\Test\\Features\\Search_Products.feature"},
	glue= {"StepDefinitions"},
	
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true,
publish = true
			)

public class TestRunner extends AbstractTestNGCucumberTests{
	
	


}
