package StepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


	@RunWith(Cucumber.class)
	public class stepdefinition {
		
	    @Given("^Validate the Browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("Validate the browser");
	    }

	    @When("^Browser is trigerred$")
	    public void browser_is_trigerred() throws Throwable {
	    	System.out.println("Browser is trigerred");
	    }

	    @Then("^Check if Browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("Check if Browser is started");
	    }
	   
		@Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	        System.out.println("User is on Netbanking landing page");
	    }

	    @When("^User logs into the application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_logsinto_the_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	 System.out.println("User logs into the application");
	    	 System.out.println(strArg1);
	    	 System.out.println(strArg2);
	    }
	    
	    @When("^User sign in with the following details$")
	    public void user_sign_in_with_the_following_details(DataTable data) throws Throwable {
	    	List<List<String>> obj = data.asLists();
	    	System.out.println(obj.get(0).get(0));
	    	System.out.println(obj.get(0).get(1));
	    	System.out.println(obj.get(0).get(2));
	    	System.out.println(obj.get(0).get(3));
	    	
	    }
	   /*@When("^User logs in to the application with (.+) and (.+)$")
	    public void user_logs_in_to_the_application_with_and(String username, String password) throws Throwable {
	    	 // Write code here that turns the phrase above into concrete actions
	        System.out.println("User logs into the application with username and password");
	        System.out.println(username);
	    	System.out.println(password);  
	    }*/

	    @Then("^Home page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	    	 System.out.println("Home page is displayed");
	    }

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg3) throws Throwable {
	    	 System.out.println("Cards displayed are");
	    	 System.out.println(strArg3);
	    }


	}

