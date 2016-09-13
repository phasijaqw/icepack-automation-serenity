package net.thucydides.showcase.cucumber.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.showcase.cucumber.pages.*;

import java.util.logging.Logger;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Properties;

public class UISteps extends ScenarioSteps {

    private static final String ENV_PROP_LOCATION = "/properties/";

    static Logger logger = Logger.getLogger(UISteps.class.getName());


    Properties prop = new Properties();

    Homepage homepage;
    SignUpPage signUpPage;
    OfferDetailsPage offerDatailsPage;
    SignInPage signInPage;
    CommercialPage commercialPage;
    ForgotYourPasswordPage forgotYourPasswordPage;
    SubscriptionPage subscriptionPage;

    public UISteps(Pages pages) {
        // load properties based on env
        try {
            prop.load(UISteps.class.getResourceAsStream(ENV_PROP_LOCATION + System.getProperty("env") + ".properties"));

        } catch (IOException e) {
            logger.info("properties can't be loaded");
        }
    }

    @Step
    public void open_home_page() {
            homepage.setDefaultBaseUrl("https://dishadmin:$l1ng2O!5@d-ottweb.movetv.com/");
            homepage.open();
            homepage.waitForTextToAppear("MEMBER SIGN IN");
            homepage.waitFor(1000);
        }

    @Step
    public void click_on_watch_now_7_days_free_button() {
             homepage.clickOnWatchNowSevenDaysFreeButton();
    }

    @Step
    public void redirect_to_create_user_account_page() {
            signUpPage.assertUserOnSignUpPage();
    }

    @Step
    public void click_on_offer_details_link() {
           offerDatailsPage.clickOnOfferDetailsLink();
    }

    @Step
    public void click_on_member_signin_link() {
           homepage.clickOnMemberSignInLink();
    }

    @Step
    public void redirect_to_sign_in_page() {
           signInPage.assertUserOnSignInPage();
    }

    @Step
    public void click_on_take_back_TV_link() {
          homepage.clickOnTakeBackTVLink();
    }

    @Step
    public void redirect_to_commercial_page() {
         commercialPage.assertUserOnCommercialPage();
    }

    @Step
    public void click_on_forgot_your_password_link() {
        signInPage.clickOnForgotYourPasswordlink();
    }

    @Step
    public void redirect_to_forgot_your_password_page() {
        forgotYourPasswordPage.assertUserOnForgotPasswordPage();
    }

    @Step
    public void click_on_not_a_member_link() {
        signInPage.clickOnNotAMemberLink();
    }

    @Step
    public void redirect_to_home_page() {
        homepage.assertUserOnHomePage();
    }

    @Step
    public void open_memberSignIn_page() {
        homepage.setDefaultBaseUrl("https://dishadmin:$l1ng2O!5@d-ottweb.movetv.com/signin/");
        homepage.open();
        homepage.waitForAngularRequestsToFinish();
    }

   @Step
    public void enterInvalidEmail(String email) {
        signInPage.enterInvalidEmail(email);
    }

    @Step
    public void clickSignInButton() {
        signInPage.clickOnSignInButton();
    }

    @Step
    public void verifyErrorMessage() {
        signInPage.verifyErrorMessage();
    }

    @Step
    public void enterValidCredentials(String emailAddress, String password) {
        signInPage.enterValidCredentials(emailAddress,password);
    }

    @Step
    public void redirect_to_subscription_page() {
        subscriptionPage.assertuserOnSubscriptionPage();
    }

    @Step
    public void enterNoExistingCredentials(String emailAddress, String passwordValue) {
        signInPage.enterNonExistingCredentails(emailAddress,passwordValue);
    }

    public void verifySignInErrorMessage() {
    }
}
