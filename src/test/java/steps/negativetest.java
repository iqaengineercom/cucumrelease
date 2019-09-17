package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class negativetest {

    @Given("Open homepage")
    public void open_homepage() {

    }

    @Given("User navigate login page")
    public void user_navigate_login_page() {

    }

    @When("Click on Sign in button")
    public void click_on_Sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Validation message")
    public void validation_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User fills incorrect login and correct password")
    public void user_fills_incorrect_login_and_correct_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User fills correct login snd incorrect password")
    public void user_fills_correct_login_snd_incorrect_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
