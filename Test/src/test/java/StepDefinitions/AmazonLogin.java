package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLogin {


	
	
	
	@When("user click sign in link")
	public void user_click_sign_in_link() {
		System.out.println("user click sign in");
	}
	
	@When("^user insert \"(.*)\"$")
	public void user_insert_userid(String userID) {
		System.out.println("user insert userid" +"\t"+ userID);
	}
	
	@Then("user click on continue")
	public void user_click_on_continue() {
		System.out.println("user click continue");
	}
	
	
	
	
}
