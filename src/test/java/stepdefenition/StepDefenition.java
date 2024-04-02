package stepdefenition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefenition {

	@Given("^User in on landing page$")
	public void user_in_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to login url");
	
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logged in success");
	}

	@Then("^Home page populated$")
	public void home_page_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validate home page");}
	  
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
       System.out.println(strArg1);
      System.out.println(strArg2);
    }

	@And("^Cards are displayed are \"([^\"]*)\"$")
	public void cards_are_displayed_are(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1);
	    throw new PendingException();
	}
	   
	}



