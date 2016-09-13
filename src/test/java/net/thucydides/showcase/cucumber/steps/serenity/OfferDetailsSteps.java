package net.thucydides.showcase.cucumber.steps.serenity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

/**
 * Created by priyanka on 13/09/16.
 */
public class OfferDetailsSteps {

    @Steps
    public UISteps uiSteps;

    @Then("^I should be redirect to Offerdetails page$")
    public void I_should_be_redirect_to_Offerdetails_page() throws Throwable {
        uiSteps.click_on_offer_details_link();
    }
}
