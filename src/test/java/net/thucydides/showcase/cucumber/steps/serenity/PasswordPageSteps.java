package net.thucydides.showcase.cucumber.steps.serenity;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

/**
 * Created by priyanka on 13/09/16.
 */
public class PasswordPageSteps {

    @Steps
    public UISteps uiSteps;

    @And("^I should be redirected to Forgot Your Password page$")
    public void I_should_be_redirected_to_Forgot_Your_Password_page() throws Throwable {
        uiSteps.redirect_to_forgot_your_password_page();
    }
}
