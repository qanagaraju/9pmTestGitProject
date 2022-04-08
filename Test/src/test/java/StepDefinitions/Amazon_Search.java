package StepDefinitions;

import java.io.FileNotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import AppElements.Product_Search_Elements;
import CucumberUtilities.BrowserDriver;
import CucumberUtilities.Property_Loader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Search extends TestRunner
{

	Property_Loader prop;
	Product_Search_Elements productSearch;
	
	
	@Before
	public void setupSuite() throws FileNotFoundException  {
		prop = new Property_Loader();
		productSearch = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Product_Search_Elements.class);
	}
	
	
	@Given("user start amazon page")
	public void user_start_amazon_page() {
		
		BrowserDriver.getCurrentDriver(prop.getbrowserType()).get(prop.getbaseUrl());
		
	}
	
	
	@When("user insert product details")
	public void user_insert_product_details() {
		
		productSearch.insert_productDetails("samsung m12");
		
		
	}
	
	
	@When("user click search button")
	public void user_click_search_button() {
		
		productSearch.user_click_searchButton();
	}
	
	
	@Then("user verify product details")
	public void user_verify_product_dtails() {
		
		productSearch.user_verify_productName();
	}
	

	
	@After
	public void closeTest() {
		
		BrowserDriver.getCurrentDriver().quit();
		
	}
	
	/*
	@AfterMethod
	
	public void addScreenshot(Scenario scenario) throws IOException {
		 
		  File screenshot = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.FILE);
		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		  scenario.attach(fileContent, "image/png", "screenshot");
		
	}
	*/
	
	
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

	      final byte[] screenshot = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		
	}
	
	
	
}
