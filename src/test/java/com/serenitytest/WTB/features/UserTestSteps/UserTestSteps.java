package com.serenitytest.WTB.features.UserTestSteps;
import com.serenitytest.WTB.features.steps.MainUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserTestSteps {

	@Steps

	MainUserSteps user;

	
	 @Given("^User is on home page$")
	 public void user_is_on_home_page() throws InterruptedException { 
	 user.openHomepage();
	 
	 }
	 @When("^Click sigin and Facebook sigin options$") 
	 public void click_sigin_and_Facebook_sigin_options() throws Exception {
	 Thread.sleep(10000);
	 user.Sigin(); 
	 }
	 @Then("^User navigate to Facebook page and gives valid data$") 
	 public void user_navigate_to_Facebook_page_and_gives_valid_data() throws Exception {
	 user.FacebookRegistration();  }
	 @Then("^user should login successfully$")
	 public void user_should_login_successfully() throws Exception {
     user.login();
	 }
	 
	@Given("^User is again on home page$")
	public void user_is_again_on_home_page() {
	user.openHomepage();
	}

	@When("^Click different date options$")
	public void click_different_date_options() throws Exception {
	    user.SelectDate();
	    
	}

	@Then("^verify the time displayed for different date$")
	public void verify_the_time_displayed_for_different_date() throws Exception {
		user.AssertDate();
		
	}

	@Given("^User is again on home page2")
	public void user_is_again_on_home_page2(){
	    
	 user.openHomepage();   
	}

	@When("^user type the place in search field$")
	public void user_type_the_place_in_search_field() throws Exception {
	   user.Selectforlocation();
	   Thread.sleep(10000);
	}

	@Then("^verify proper timezone is displayed in the search field$")
	public void verify_proper_timezone_is_displayed_in_the_search_field() throws Exception {
	    
	 user. Selectforlocationassertion(); 
	}
	}


