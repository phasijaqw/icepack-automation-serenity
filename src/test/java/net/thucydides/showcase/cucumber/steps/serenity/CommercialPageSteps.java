package net.thucydides.showcase.cucumber.steps.serenity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

/**
 * Created by priyanka on 13/09/16.
 */
public class CommercialPageSteps {

    @Steps
    public UISteps uiSteps;

    @Then("^I should be redirected to Commercial page$")
    public void I_should_be_redirected_to_Commercial_page() throws Throwable {
       uiSteps.redirect_to_commercial_page();
    }
}
