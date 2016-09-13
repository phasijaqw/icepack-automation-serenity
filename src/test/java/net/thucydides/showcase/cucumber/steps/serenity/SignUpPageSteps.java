package net.thucydides.showcase.cucumber.steps.serenity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by priyanka on 13/09/16.
 */
public class SignUpPageSteps {

    @Steps
    public UISteps uiSteps;

    @When("^I should be redirected to Create User Account page$")
    public void I_should_be_redirected_to_create_user_account_page() throws Throwable {
        uiSteps.redirect_to_create_user_account_page();
    }
}
