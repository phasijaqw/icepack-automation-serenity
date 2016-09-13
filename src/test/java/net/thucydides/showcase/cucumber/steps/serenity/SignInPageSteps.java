package net.thucydides.showcase.cucumber.steps.serenity;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by priyanka on 13/09/16.
 */
public class SignInPageSteps {

    @Steps
    public UISteps uiSteps;

    @Then("^I should be redirected to Sign In page$")
    public void I_should_be_redirected_to_Sign_In_page() throws Throwable {
       uiSteps.redirect_to_sign_in_page();
    }

    @Then("^I click on Forgot Your Password link$")
    public void I_click_on_Forgot_Your_Password_link() throws Throwable {
       uiSteps.click_on_forgot_your_password_link();
    }

    @And("^I click on Not a member link$")
    public void I_click_on_Not_a_member_link() throws Throwable {
      uiSteps.click_on_not_a_member_link();
    }

    @Given("^I am on MEMBER SIGN IN Page$")
    public void I_am_on_MEMBER_SIGN_IN_Page() throws Throwable {
        uiSteps.open_memberSignIn_page();
    }

    @When("^I enter invalid email address \"([^\"]*)\"$")
    public void I_enter_invalid_email_address(String email) throws Throwable {
        uiSteps.enterInvalidEmail(email);
    }

    @Then("^I should see a proper error message for email field$")
    public void I_should_see_a_proper_error_message_for_email_field() throws Throwable {
        uiSteps.verifyErrorMessage();
    }

    @When("^I enter valid email address \"([^\"]*)\" and valid password \"([^\"]*)\"$")
    public void I_enter_valid_email_address_and_valid_password(String emailAddress, String password) throws Throwable {
       uiSteps.enterValidCredentials(emailAddress, password);
    }

    @Then("^I hit Sign In button$")
    public void I_hit_Sign_In_button() throws Throwable {
        uiSteps.clickSignInButton();
    }

    @When("^I enter non existing email address \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void I_enter_non_existing_email_address_and_password(String emailAddress, String passwordValue) throws Throwable {
       uiSteps.enterNoExistingCredentials(emailAddress,passwordValue);
    }

    @And("^I should see \"([^\"]*)\" error message$")
    public void I_should_see_error_message(String errorMessage) throws Throwable {
       uiSteps.verifySignInErrorMessage();
    }
}
